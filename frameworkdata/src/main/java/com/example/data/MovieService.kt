package com.example.data

import com.example.data.config.ConfigEntity
import com.example.data.movies.MovieListEntity
import javax.inject.Inject

import com.example.utils.Result
import com.example.utils.Failure
import com.example.utils.request

class MovieService constructor(
    private val apiService: ApiService
) {

    suspend fun getConfig(): Result<Failure, ConfigEntity> {
        return request { apiService.getConfig() }
    }

    suspend fun getMovieList(): Result<Failure, MovieListEntity> {
        return request { apiService.getMovieList() }
    }

}