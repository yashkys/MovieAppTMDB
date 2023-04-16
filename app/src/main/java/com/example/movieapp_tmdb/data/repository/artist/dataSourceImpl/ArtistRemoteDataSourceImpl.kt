package com.example.movieapp_tmdb.data.repository.artist.dataSourceImpl

import com.example.movieapp_tmdb.data.api.TMDBService
import com.example.movieapp_tmdb.data.model.artist.ArtistList
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey: String
): ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> =
        tmdbService.getPopularArtists(apiKey)
}