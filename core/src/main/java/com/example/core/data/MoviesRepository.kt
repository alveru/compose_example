package com.example.core.data

class MoviesRepository(
    private val moviesDataSource: MoviesDataSource
) {
    suspend fun getMovieList() = moviesDataSource.getMovieList()
}