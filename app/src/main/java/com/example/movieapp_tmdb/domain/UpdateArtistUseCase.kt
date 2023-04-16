package com.example.movieapp_tmdb.domain

import com.example.movieapp_tmdb.data.model.artist.Artist


class UpdateArtistUseCase (
    private val artistRepository: ArtistRepository
) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()

}