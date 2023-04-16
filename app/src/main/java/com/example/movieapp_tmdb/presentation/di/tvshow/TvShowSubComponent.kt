package com.example.movieapp_tmdb.presentation.di.tvshow

import com.example.movieapp_tmdb.presentation.artist.ArtistActivity
import com.example.movieapp_tmdb.presentation.tvshow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)
    @Subcomponent.Factory
    interface Factory {
        fun create():TvShowSubComponent
    }
}