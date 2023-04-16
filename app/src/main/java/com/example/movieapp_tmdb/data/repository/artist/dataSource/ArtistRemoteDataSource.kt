package com.example.movieapp_tmdb.data.repository.artist.dataSource

import com.example.movieapp_tmdb.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}