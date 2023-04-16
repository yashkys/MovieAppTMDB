package com.example.movieapp_tmdb.data.repository.movie.dataSourceImpl

import com.example.movieapp_tmdb.data.api.TMDBService
import com.example.movieapp_tmdb.data.model.movie.MovieList
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey: String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList>  =
        tmdbService.getPopularMovies(apiKey)
}