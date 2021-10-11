package com.example.core.domain

data class Config(
    var images: ImageConfig = ImageConfig()
) {

    data class ImageConfig(
        val baseUrl: String = "",
        val secureBaseUrl: String = "",
        var backDropSizes: List<String> = ArrayList(),
        var logoSize: List<String> = ArrayList(),
        var posterSizes: List<String> = ArrayList(),
        var profileSizes: List<String> = ArrayList(),
    )

    fun getImagePath(path: String): String {
        return images.baseUrl + images.posterSizes[0] + path
    }
}