package com.example.artistapp_tmdb.data.repository.artist

import android.util.Log
import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistCacheDataSource
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistLocalDataSource
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.example.movieapp_tmdb.domain.repository.ArtistRepository

class ArtistRepositoryImpl(
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource,
): ArtistRepository {
    override suspend fun getArtists(): List<Artist> {
        return getArtistsFromCache()
    }

    override suspend fun updateArtists(): List<Artist> {
        val newListOfArtists: List<Artist> = getArtistsFromAPI()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistsToDB(newListOfArtists)
        artistCacheDataSource.saveArtistsToCache(newListOfArtists)
        return newListOfArtists
    }

    private suspend fun getArtistsFromAPI(): List<Artist>{
        var artistList: List<Artist>? = null
        try{
            val response = artistRemoteDataSource.getArtists()
            val body = response.body()
            if(body!=null){
                artistList = body.artists
            }
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return artistList!!
    }

    private suspend fun getArtistsFromDB(): List<Artist>{
        var artistList: List<Artist>? = null
        try{
            artistList = artistLocalDataSource.getArtistsFromDB()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(artistList!!.isNotEmpty()){
            return artistList
        }else{
            artistList = getArtistsFromAPI()
            artistLocalDataSource.saveArtistsToDB(artistList)
        }
        return artistList
    }

    private suspend fun getArtistsFromCache(): List<Artist> {
        var artistList: List<Artist>? = null
        try{
            artistList = artistCacheDataSource.getArtistsFromCache()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(artistList!!.isNotEmpty()){
            return artistList
        }else{
            artistList = getArtistsFromDB()
            artistCacheDataSource.saveArtistsToCache(artistList)
        }
        return artistList

    }

}