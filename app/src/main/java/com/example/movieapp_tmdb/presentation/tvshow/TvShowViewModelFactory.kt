package com.example.movieapp_tmdb.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp_tmdb.domain.useCase.GetMoviesUseCase
import com.example.movieapp_tmdb.domain.useCase.GetTvShowsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateMovieUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateMTvShowsUseCase: UpdateTvShowsUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel( getTvShowsUseCase, updateMTvShowsUseCase) as T
    }
}