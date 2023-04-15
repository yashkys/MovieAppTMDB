package com.example.movieapp_tmdb.data.model.artist


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("popular_artists")
data class Artist(
//    @SerializedName("adult")
//    val adult: Boolean,
//    @SerializedName("gender")
//    val gender: Int,
//    @SerializedName("known_for_department")
//    val knownForDepartment: String,
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("popularity")
    val popularity: Double?,
    @SerializedName("profile_path")
    val profilePath: String?
)