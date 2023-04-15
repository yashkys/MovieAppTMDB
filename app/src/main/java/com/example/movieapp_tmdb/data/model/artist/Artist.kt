package com.example.movieapp_tmdb.data.model.artist


import com.google.gson.annotations.SerializedName

data class Artist(
//    @SerializedName("adult")
//    val adult: Boolean,
//    @SerializedName("gender")
//    val gender: Int,
//    @SerializedName("known_for_department")
//    val knownForDepartment: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("known_for")
    val knownFor: List<KnownFor>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("popularity")
    val popularity: Double?,
    @SerializedName("profile_path")
    val profilePath: String?
)