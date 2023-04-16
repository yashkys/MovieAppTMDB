package com.example.movieapp_tmdb.domain.useCase

import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.domain.repository.ArtistRepository


class UpdateArtistUseCase (
    private val artistRepository: ArtistRepository
) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()

}