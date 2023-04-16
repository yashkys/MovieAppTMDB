package com.example.movieapp_tmdb.data.repository.movie

import android.util.Log
import com.example.movieapp_tmdb.data.model.movie.Movie
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieCacheDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieLocalDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieRemoteDataSource
import com.example.movieapp_tmdb.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource,
): MovieRepository {
    override suspend fun getMovies(): List<Movie> {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies: List<Movie> = getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }

    private suspend fun getMoviesFromAPI(): List<Movie>{
        var movieList: List<Movie>? = null
        try{
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if(body!=null){
                movieList = body.movies
            }
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return movieList!!
    }

    private suspend fun getMoviesFromDB(): List<Movie>{
        var movieList: List<Movie>? = null
        try{
            movieList = movieLocalDataSource.getMoviesFromDB()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(movieList!!.isNotEmpty()){
            return movieList
        }else{
            movieList = getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    private suspend fun getMoviesFromCache(): List<Movie> {
        var movieList: List<Movie>? = null
        try{
            movieList = movieCacheDataSource.getMoviesFromCache()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(movieList!!.isNotEmpty()){
            return movieList
        }else{
            movieList = getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return movieList

    }

}