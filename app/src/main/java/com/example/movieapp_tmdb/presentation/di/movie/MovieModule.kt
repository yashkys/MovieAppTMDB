package com.example.movieapp_tmdb.presentation.di.movie

import com.example.movieapp_tmdb.domain.useCase.GetMoviesUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateMovieUseCase
import com.example.movieapp_tmdb.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMovieUseCase: UpdateMovieUseCase
    ): MovieViewModelFactory {
        return  MovieViewModelFactory(getMoviesUseCase, updateMovieUseCase)
    }
}