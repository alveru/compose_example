package com.example.core.data

import javax.inject.Inject

class ConfigRepository @Inject constructor(private val dataSource: ConfigDataSource) {
    suspend fun getConfig() = dataSource.getConfig()
}