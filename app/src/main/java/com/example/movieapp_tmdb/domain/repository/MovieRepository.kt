package com.example.movieapp_tmdb.domain.repository

import com.example.movieapp_tmdb.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}