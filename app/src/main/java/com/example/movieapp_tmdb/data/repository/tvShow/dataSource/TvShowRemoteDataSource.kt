package com.example.movieapp_tmdb.data.repository.tvShow.dataSource

import com.example.movieapp_tmdb.data.model.tvShow.TVShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TVShowList>
}