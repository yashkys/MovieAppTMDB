package com.example.movieapp_tmdb.domain.repository

import com.example.movieapp_tmdb.data.model.artist.Artist

interface ArtistRepository  {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}