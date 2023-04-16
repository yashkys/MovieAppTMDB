package com.example.movieapp_tmdb.presentation.di.core

import com.example.movieapp_tmdb.presentation.di.artist.ArtistSubComponent
import com.example.movieapp_tmdb.presentation.di.movie.MovieSubComponent
import com.example.movieapp_tmdb.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DatabaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ])
interface AppComponent {
    /* factory methods*/

    fun movieSubcomponent(): MovieSubComponent.Factory

    fun tvShowSubcomponent(): TvShowSubComponent.Factory

    fun artistSubcomponent(): ArtistSubComponent.Factory

}