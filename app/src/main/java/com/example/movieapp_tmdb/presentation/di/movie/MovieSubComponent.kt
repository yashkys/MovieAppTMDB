package com.example.movieapp_tmdb.presentation.di.movie
import com.example.movieapp_tmdb.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)
    @Subcomponent.Factory
    interface Factory {
        fun create():MovieSubComponent
    }
}