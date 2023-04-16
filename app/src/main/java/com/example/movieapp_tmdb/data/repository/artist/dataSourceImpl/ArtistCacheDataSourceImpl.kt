package com.example.artistapp_tmdb.data.repository.artist.dataSourceImpl

import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl: ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()
    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artists)
    }
}