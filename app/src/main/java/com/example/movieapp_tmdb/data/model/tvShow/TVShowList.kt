package com.example.movieapp_tmdb.data.model.tvShow


import com.google.gson.annotations.SerializedName

data class TVShowList(
    @SerializedName("results")
    val tvShows: List<TVShow>
//    @SerializedName("page")
//    val page: Int,
//    @SerializedName("total_pages")
//    val totalPages: Int,
//    @SerializedName("total_results")
//    val totalResults: Int
)