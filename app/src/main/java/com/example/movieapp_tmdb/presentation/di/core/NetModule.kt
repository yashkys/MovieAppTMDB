package com.example.movieapp_tmdb.presentation.di.core

import com.example.movieapp_tmdb.data.api.TMDBService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(    /* Network Module */
    private val baseUrl: String
) {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return  Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideTMDBService(retrofit: Retrofit):TMDBService {
        return retrofit.create(TMDBService::class.java)
    }
}