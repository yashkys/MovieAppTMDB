package com.example.movieapp_tmdb.data.repository.tvShow.dataSource

import com.example.movieapp_tmdb.data.model.tvShow.TVShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TVShow>
    suspend fun saveTvShowsToDB(tvShows: List<TVShow>)
    suspend fun clearAll()
}