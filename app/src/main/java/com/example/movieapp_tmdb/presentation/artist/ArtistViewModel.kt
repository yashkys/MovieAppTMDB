package com.example.movieapp_tmdb.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movieapp_tmdb.domain.useCase.GetArtistsUseCase
import com.example.movieapp_tmdb.domain.useCase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
): ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }

}