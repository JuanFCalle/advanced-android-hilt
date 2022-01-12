package com.juancalle.advancedandroidhilt.trending.data

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET


interface GithubAPIService {
    @GET("search/repositories?q=language:kotlin&order=desc&sort=stars")
    fun getKotlinTrendingRepositories(): Single<GithubAPIResponse>
}