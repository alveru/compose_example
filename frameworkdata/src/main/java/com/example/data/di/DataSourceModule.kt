package com.example.data.di

import com.example.core.data.ConfigDataSource
import com.example.core.data.MoviesDataSource
import com.example.data.config.ConfigDataSourceImpl
import com.example.data.movies.MoviesDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindConfigDataSource(dataSource: ConfigDataSourceImpl): ConfigDataSource

    @Binds
    abstract fun bindMoviesDataSource(dataSource: MoviesDataSourceImpl): MoviesDataSource
}