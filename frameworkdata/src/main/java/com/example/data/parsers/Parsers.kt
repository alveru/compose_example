package com.example.data.parsers

import com.example.core.domain.Config
import com.example.core.domain.Movie
import com.example.data.config.ConfigEntity
import com.example.data.movies.MovieListEntity


fun MovieParser(movieListDataModel: MovieListEntity): List<Movie> =
    movieListDataModel.results.map { movieDataModel ->
        Movie(
            id = movieDataModel.id,
            title = movieDataModel.title,
            posterPath = movieDataModel.posterPath,
            releaseDate = movieDataModel.releaseDate,
            voteAverage = movieDataModel.voteAverage,
            voteCount = movieDataModel.voteCount
        )
    }

fun ConfigParser(configEntity: ConfigEntity) =
    Config(
        images = Config.ImageConfig(
            baseUrl = configEntity.images.baseUrl,
            secureBaseUrl = configEntity.images.secureBaseUrl,
            posterSizes = configEntity.images.posterSizes,
            logoSize = configEntity.images.logoSize,
            profileSizes = configEntity.images.profileSizes,
            backDropSizes = configEntity.images.backDropSizes
        )
    )