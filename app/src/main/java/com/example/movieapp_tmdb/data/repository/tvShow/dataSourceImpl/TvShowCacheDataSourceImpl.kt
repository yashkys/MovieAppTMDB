package com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl

import com.example.movieapp_tmdb.data.model.tvShow.TVShow
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {
    private var tvShowList = ArrayList<TVShow>()
    override suspend fun getTvShowsFromCache(): List<TVShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TVShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}