package com.example.movieapp_tmdb.data.repository.tvShow.dataSource

import com.example.movieapp_tmdb.data.model.tvShow.TVShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TVShow>
    suspend fun saveTvShowsToCache(tvShows: List<TVShow>)
}