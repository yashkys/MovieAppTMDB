package com.example.movieapp_tmdb.presentation.di.tvshow

import com.example.movieapp_tmdb.domain.useCase.GetTvShowsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateTvShowsUseCase
import com.example.movieapp_tmdb.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return  TvShowViewModelFactory(getTvShowsUseCase, updateTvShowUseCase)
    }
}