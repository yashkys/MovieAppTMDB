package com.example.movieapp_tmdb.domain.useCase

import com.example.movieapp_tmdb.data.model.tvShow.TVShow
import com.example.movieapp_tmdb.domain.repository.TvShowRepository

class UpdateTvShowsUseCase (
    private val tvShowRepository: TvShowRepository
) {
    suspend fun execute(): List<TVShow>? = tvShowRepository.updateTvShows()
}