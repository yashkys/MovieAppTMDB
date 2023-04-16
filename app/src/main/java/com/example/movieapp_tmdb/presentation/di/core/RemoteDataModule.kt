package com.example.movieapp_tmdb.presentation.di.core

import com.example.movieapp_tmdb.data.api.TMDBService
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.example.movieapp_tmdb.data.repository.artist.dataSourceImpl.ArtistRemoteDataSourceImpl
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieRemoteDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSourceImpl.MovieRemoteDataSourceImpl
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(
    private val apiKey: String
) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(
        tmdbService: TMDBService
    ): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
                    tmdbService,
                    apiKey
                )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(
        tmdbService: TMDBService
    ): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(
        tmdbService: TMDBService
    ): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }

}