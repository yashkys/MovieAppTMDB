package com.example.movieapp_tmdb.presentation.di.core

import com.example.movieapp_tmdb.data.db.ArtistDao
import com.example.movieapp_tmdb.data.db.MovieDao
import com.example.movieapp_tmdb.data.db.TvShowDao
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistLocalDataSource
import com.example.artistapp_tmdb.data.repository.artist.dataSourceImpl.ArtistLocalDataSourceImpl
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieLocalDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSourceImpl.MovieLocalDataSourceImpl
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule  {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(
        movieDao: MovieDao
    ): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvLocalDataSource(
        tvShowDao: TvShowDao
    ): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(
        artistDao: ArtistDao
    ): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}