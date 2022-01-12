package com.juancalle.advancedandroidhilt.trending.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    val id: Long,
    val login: String
)
