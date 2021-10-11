package com.example.data.config

import com.example.core.data.ConfigDataSource
import com.example.core.domain.Config
import com.example.data.ApiService
import com.example.data.parsers.ConfigParser
import com.example.utils.Failure
import com.example.utils.Result
import com.example.utils.parseOnSuccess
import com.example.utils.request
import javax.inject.Inject

class ConfigDataSourceImpl @Inject constructor(private val apiService: ApiService) : ConfigDataSource{

    override suspend fun getConfig(): Result<Failure, Config> {
        return request { apiService.getConfig() }.parseOnSuccess {
            ConfigParser(it)
        }
    }
}