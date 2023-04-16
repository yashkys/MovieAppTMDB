package com.example.movieapp_tmdb.data.repository.movie.dataSource

import com.example.movieapp_tmdb.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}