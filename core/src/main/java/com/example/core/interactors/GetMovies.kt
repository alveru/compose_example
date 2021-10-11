package com.example.core.interactors

import com.example.core.data.MoviesRepository
import com.example.core.domain.Movie
import com.example.utils.Failure
import com.example.utils.Result
import javax.inject.Inject

class GetMovies @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun getMovieList(): Result<Failure, List<Movie>> =
        moviesRepository.getMovieList()
}