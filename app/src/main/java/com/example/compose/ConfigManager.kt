package com.example.compose

import com.example.core.domain.Config
import com.example.core.interactors.GetConfig
import com.example.utils.Failure
import com.example.utils.Result
import com.example.utils.onSuccess
import javax.inject.Inject

class ConfigManager @Inject constructor(
    private val config: GetConfig
) {

    private var configData: Config? = null

    suspend fun getConfig(): Result<Failure, Config> {
        return configData?.let {
            Result.Success(it)
        } ?: config.execute().onSuccess {
            configData = it
            Result.Success(it)
        }
    }
}