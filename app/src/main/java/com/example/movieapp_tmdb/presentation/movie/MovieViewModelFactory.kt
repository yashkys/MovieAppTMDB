package com.example.movieapp_tmdb.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp_tmdb.domain.useCase.GetMoviesUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateMovieUseCase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMovieUseCase: UpdateMovieUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        /*
        MovieViewModel passing useCase instance as arguments and return as T
         */
        return MovieViewModel(getMoviesUseCase, updateMovieUseCase) as T
    }
}