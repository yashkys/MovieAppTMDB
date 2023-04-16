package com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl

import com.example.movieapp_tmdb.data.db.TvShowDao
import com.example.movieapp_tmdb.data.model.tvShow.TVShow
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(
    private val tvShowDao: TvShowDao
): TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TVShow> =
        tvShowDao.getTvShows()

    override suspend fun saveTvShowsToDB(tvShows: List<TVShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTvShows()
        }
    }
}