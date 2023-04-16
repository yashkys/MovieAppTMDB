package com.example.movieapp_tmdb.data.repository.artist.dataSource

import com.example.movieapp_tmdb.data.model.artist.Artist


interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}