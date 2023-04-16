package com.example.movieapp_tmdb.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movieapp_tmdb.domain.useCase.GetTvShowsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
): ViewModel() {

    fun getTvShows() = liveData {
        val tvShowsList = getTvShowsUseCase.execute()
        emit(tvShowsList)
    }

    fun updateTvShows() = liveData {
        val tvShowsList = updateTvShowsUseCase.execute()
        emit(tvShowsList)
    }

}