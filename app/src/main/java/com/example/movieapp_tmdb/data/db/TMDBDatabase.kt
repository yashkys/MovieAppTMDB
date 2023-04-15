package com.example.movieapp_tmdb.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp_tmdb.data.model.artist.Artist
import com.example.movieapp_tmdb.data.model.movie.Movie
import com.example.movieapp_tmdb.data.model.tvShow.TVShow

@Database(
    entities = [Movie::class, TVShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}