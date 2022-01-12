package com.juancalle.advancedandroidhilt.trending.model

import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class Repository(
    val id: Long,
    val name: String,
    val description: String,
    val owner: User,
    val stargazers_count: Long,
    val forks_count: Long,
    val contributor_url: String,
    val created_at: Date,
    val updated_at: Date
)