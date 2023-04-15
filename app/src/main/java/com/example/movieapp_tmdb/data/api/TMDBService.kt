package com.example.movieapp_tmdb.data.api

import com.example.movieapp_tmdb.data.ArtistList
import com.example.movieapp_tmdb.data.MovieList
import com.example.movieapp_tmdb.data.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    /*
    * these functions are retrofit response objects
    */
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")apiKey:String
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShows(
        @Query("api_key")apiKey:String
    ): Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(
        @Query("api_key")apiKey:String
    ): Response<ArtistList>

}