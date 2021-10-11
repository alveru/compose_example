package com.example.data.movies

import com.example.data.movies.MovieEntity
import com.google.gson.annotations.SerializedName

data class MovieListEntity(
    val page: Int,
    val results: List<MovieEntity>,
    @SerializedName("total_pages")
    val totalPages: Int
)