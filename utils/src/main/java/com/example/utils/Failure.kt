package com.example.utils

sealed class Failure {
    data class CustomError(val error: String) : Failure()
    object NoContent : Failure()
}