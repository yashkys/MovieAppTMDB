package com.example.movieapp_tmdb.domain

import com.example.movieapp_tmdb.data.model.tvShow.TVShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TVShow>?
    suspend fun updateTvShows(): List<TVShow>?
}