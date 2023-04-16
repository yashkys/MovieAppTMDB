package com.example.movieapp_tmdb.data.repository.movie.dataSource

import com.example.movieapp_tmdb.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}