package com.example.movieapp_tmdb.domain

import com.example.movieapp_tmdb.data.model.tvShow.TVShow

class UpdateTvShowsUseCase (
    private val tvShowRepository: TvShowRepository
) {
    suspend fun execute(): List<TVShow>? = tvShowRepository.updateTvShows()
}