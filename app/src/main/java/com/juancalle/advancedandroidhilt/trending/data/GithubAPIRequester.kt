package com.juancalle.advancedandroidhilt.trending.data

import com.juancalle.advancedandroidhilt.trending.model.Repository
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class GithubAPIRequester @Inject constructor(
    val githubAPIService: GithubAPIService
) {

    fun getKotlinTrendingRepositories(): Single<List<Repository>> =
        githubAPIService.getKotlinTrendingRepositories()
            .map(GithubAPIResponse::items)
            .subscribeOn(Schedulers.io())

}