package com.example.movieapp_tmdb.domain.useCase

import com.example.movieapp_tmdb.data.model.movie.Movie
import com.example.movieapp_tmdb.domain.repository.MovieRepository

class GetMoviesUseCase(
    private val movieRepository: MovieRepository
) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}