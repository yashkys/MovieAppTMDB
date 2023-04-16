package com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl

import com.example.movieapp_tmdb.data.api.TMDBService
import com.example.movieapp_tmdb.data.model.tvShow.TVShowList
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey: String
): TvShowRemoteDataSource {

    override suspend fun getTvShows(): Response<TVShowList>  =
        tmdbService.getPopularTVShows(apiKey)
}