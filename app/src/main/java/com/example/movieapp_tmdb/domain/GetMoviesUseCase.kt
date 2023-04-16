package com.example.movieapp_tmdb.domain

import com.example.movieapp_tmdb.data.model.movie.Movie

class GetMoviesUseCase(
    private val movieRepository: MovieRepository
) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}