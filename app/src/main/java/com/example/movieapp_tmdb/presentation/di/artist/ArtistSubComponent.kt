package com.example.movieapp_tmdb.presentation.di.artist

import com.example.movieapp_tmdb.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)
    @Subcomponent.Factory
    interface Factory {
        fun create():ArtistSubComponent
    }
}