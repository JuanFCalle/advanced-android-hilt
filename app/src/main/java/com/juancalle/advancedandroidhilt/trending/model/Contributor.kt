package com.juancalle.advancedandroidhilt.trending.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Contributor(
    val id: Long,
    val login: String,
    val avatar_url: String
)