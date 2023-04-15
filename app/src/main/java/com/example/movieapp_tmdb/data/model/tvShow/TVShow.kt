package com.example.movieapp_tmdb.data.model.tvShow


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("popular_tv_shows")
data class TVShow(
    @SerializedName("first_air_date")
    val firstAirDate: String?,
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?
)

//    @SerializedName("backdrop_path")
//    val backdropPath: String,
//    @SerializedName("genre_ids")
//    val genreIds: List<Int>,
//    @SerializedName("origin_country")
//    val originCountry: List<String>,
//    @SerializedName("original_language")
//    val originalLanguage: String,
//    @SerializedName("original_name")
//    val originalName: String,
//    @SerializedName("popularity")
//    val popularity: Double,
//    @SerializedName("vote_average")
//    val voteAverage: Double,
//    @SerializedName("vote_count")
//    val voteCount: Int