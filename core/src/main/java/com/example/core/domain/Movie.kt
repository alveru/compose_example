package com.example.core.domain

data class Movie(

    var id: Int = 0,
    var title: String = "",
    var adult: Boolean = false,
    var overview: String = "",
    val voteCount: Int = 0,
    var voteAverage: Float = 0.0F,
    var posterPath: String = "",
    var originalLanguage: String = "",
    var releaseDate: String = ""

)