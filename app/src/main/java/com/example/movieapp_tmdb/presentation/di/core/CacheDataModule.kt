package com.example.movieapp_tmdb.presentation.di.core

import com.example.artistapp_tmdb.data.repository.artist.dataSourceImpl.ArtistCacheDataSourceImpl
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistCacheDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieCacheDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSourceImpl.MovieCacheDataSourceImpl
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

}