package com.example.movieapp_tmdb.data.model.artist


import com.example.movieapp_tmdb.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
//    @SerializedName("page")
//    val page: Int,
//    @SerializedName("total_pages")
//    val totalPages: Int,
//    @SerializedName("total_results")
//    val totalResults: Int
)