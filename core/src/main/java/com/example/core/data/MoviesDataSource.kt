package com.example.core.data

import com.example.core.domain.Movie
import com.example.utils.Failure
import com.example.utils.Result

interface MoviesDataSource {
    suspend fun getMovieList(): Result<Failure, List<Movie>>
}