package com.example.movieapp_tmdb.domain

import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.data.model.movie.Movie

class GetArtistsUseCase (
    private val artistRepository: ArtistRepository
) {

    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}