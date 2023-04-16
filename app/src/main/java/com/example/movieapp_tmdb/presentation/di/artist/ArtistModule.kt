package com.example.movieapp_tmdb.presentation.di.artist

import com.example.movieapp_tmdb.domain.useCase.GetArtistsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateArtistUseCase
import com.example.movieapp_tmdb.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
        return  ArtistViewModelFactory(getArtistsUseCase, updateArtistUseCase)
    }
}