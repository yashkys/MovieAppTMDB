package com.example.movieapp_tmdb.data.repository.movie.dataSource

import com.example.movieapp_tmdb.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}