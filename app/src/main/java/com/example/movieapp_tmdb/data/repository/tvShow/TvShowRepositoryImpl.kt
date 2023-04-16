package com.example.movieapp_tmdb.data.repository.tvShow

import android.util.Log
import com.example.movieapp_tmdb.data.model.tvShow.TVShow
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import com.example.movieapp_tmdb.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource,
): TvShowRepository {
    override suspend fun getTvShows(): List<TVShow> {
        return getTVShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TVShow> {
        val newListOfTVShows: List<TVShow> = getTVShowsFromAPI()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTVShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTVShows)
        return newListOfTVShows
    }

    private suspend fun getTVShowsFromAPI(): List<TVShow>{
        var tvShowList: List<TVShow>? = null
        try{
            val response = tvShowRemoteDataSource.getTvShows()
            val body = response.body()
            if(body!=null){
                tvShowList = body.tvShows
            }
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList!!
    }

    private suspend fun getTVShowsFromDB(): List<TVShow>{
        var tvShowList: List<TVShow>? = null
        try{
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(tvShowList!!.isNotEmpty()){
            return tvShowList
        }else{
            tvShowList = getTVShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsToDB(tvShowList)
        }
        return tvShowList
    }

    private suspend fun getTVShowsFromCache(): List<TVShow> {
        var tvShowList: List<TVShow>? = null
        try{
            tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        }catch (exception: java.lang.Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(tvShowList!!.isNotEmpty()){
            return tvShowList
        }else{
            tvShowList = getTVShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList

    }

}