package com.example.movieapp_tmdb.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp_tmdb.domain.useCase.GetArtistsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateArtistUseCase

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return ArtistViewModel(getArtistsUseCase, updateArtistUseCase) as T
    }
}