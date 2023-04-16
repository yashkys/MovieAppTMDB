package com.example.movieapp_tmdb.presentation.di.core

import com.example.artistapp_tmdb.data.repository.artist.ArtistRepositoryImpl
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistCacheDataSource
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistLocalDataSource
import com.example.movieapp_tmdb.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.example.movieapp_tmdb.data.repository.movie.MovieRepositoryImpl
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieCacheDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieLocalDataSource
import com.example.movieapp_tmdb.data.repository.movie.dataSource.MovieRemoteDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.TvShowRepositoryImpl
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.movieapp_tmdb.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepositoryImpl {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepositoryImpl {
        return TvShowRepositoryImpl(
            tvShowRemoteDataSource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepositoryImpl {
        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }

}