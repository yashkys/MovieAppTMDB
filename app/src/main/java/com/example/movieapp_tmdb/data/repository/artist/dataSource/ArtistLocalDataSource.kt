package com.example.movieapp_tmdb.data.repository.artist.dataSource

import com.example.movieapp_tmdb.data.model.artist.Artist


interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artists: List<Artist>)
    suspend fun clearAll()
}