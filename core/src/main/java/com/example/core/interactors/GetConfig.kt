package com.example.core.interactors

import com.example.core.data.ConfigRepository
import com.example.core.domain.Config
import javax.inject.Inject

class GetConfig @Inject constructor(
    private val configRepository: ConfigRepository
) : BaseInteractor<Config> {

    override suspend fun execute() = configRepository.getConfig()

}