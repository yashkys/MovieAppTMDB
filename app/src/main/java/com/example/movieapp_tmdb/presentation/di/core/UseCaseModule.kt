package com.example.movieapp_tmdb.presentation.di.core

import com.example.movieapp_tmdb.domain.repository.ArtistRepository
import com.example.movieapp_tmdb.domain.repository.MovieRepository
import com.example.movieapp_tmdb.domain.repository.TvShowRepository
import com.example.movieapp_tmdb.domain.useCase.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetMoviesUseCase(
        movieRepository: MovieRepository
    ): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateMovieUseCase(
        movieRepository: MovieRepository
    ): UpdateMovieUseCase {
        return UpdateMovieUseCase(movieRepository)
    }

    @Singleton
    @Provides
    fun provideGetTvShowsUseCase(
        tvShowRepository: TvShowRepository
    ): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateTvShowsUseCase(
        tvShowRepository: TvShowRepository
    ): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Singleton
    @Provides
    fun provideGetArtistsUseCase(
        artistRepository: ArtistRepository
    ): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateArtistUseCase(
        artistRepository: ArtistRepository
    ): UpdateArtistUseCase {
        return UpdateArtistUseCase(artistRepository)
    }

}