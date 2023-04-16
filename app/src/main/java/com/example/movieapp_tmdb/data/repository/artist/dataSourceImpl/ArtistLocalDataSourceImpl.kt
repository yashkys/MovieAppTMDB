package com.example.artistapp_tmdb.data.repository.artist.dataSourceImpl

import com.example.movieapp_tmdb.data.db.ArtistDao
import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(
    private val artistDao: ArtistDao
): ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> =
        artistDao.getArtists()

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.deleteAllArtists()
        }
    }
}