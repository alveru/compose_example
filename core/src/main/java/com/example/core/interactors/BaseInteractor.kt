package com.example.core.interactors

import com.example.utils.Result
import com.example.utils.Failure

interface BaseInteractor<T> {
    suspend fun execute() : Result<Failure, T>
}