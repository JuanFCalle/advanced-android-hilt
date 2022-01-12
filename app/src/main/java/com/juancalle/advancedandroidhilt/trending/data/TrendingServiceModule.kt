package com.juancalle.advancedandroidhilt.trending.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TrendingServiceModule {
    @Provides
    @Singleton
    fun provideGithubAPIService(retrofit: Retrofit): GithubAPIService =
        retrofit.create(GithubAPIService::class.java)
}