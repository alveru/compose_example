package com.example.data.movies

import com.example.core.data.MoviesDataSource
import com.example.core.domain.Movie
import com.example.data.ApiService
import com.example.data.parsers.MovieParser
import com.example.utils.Failure
import com.example.utils.Result
import com.example.utils.parseOnSuccess
import com.example.utils.request
import javax.inject.Inject


class MoviesDataSourceImpl @Inject constructor(private val apiService: ApiService) :
    MoviesDataSource {
    override suspend fun getMovieList(): Result<Failure, List<Movie>> {
        return request { apiService.getMovieList() }.parseOnSuccess { MovieParser(it) }
    }
}