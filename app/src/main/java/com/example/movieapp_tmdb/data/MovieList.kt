package com.example.movieapp_tmdb.data


import com.example.movieapp_tmdb.data.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)


//    @SerializedName("page")
//    val page: Int,
//    @SerializedName("total_pages")
//    val totalPages: Int,
//    @SerializedName("total_results")
//    val totalResults: Int