package com.example.core.data

import com.example.core.domain.Config
import com.example.utils.Failure
import com.example.utils.Result

interface ConfigDataSource {
    suspend fun getConfig(): Result<Failure, Config>
}