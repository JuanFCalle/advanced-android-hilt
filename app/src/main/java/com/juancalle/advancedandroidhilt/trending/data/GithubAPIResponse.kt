package com.juancalle.advancedandroidhilt.trending.data

import com.juancalle.advancedandroidhilt.trending.model.Repository
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GithubAPIResponse(
    val items: List<Repository>
)
