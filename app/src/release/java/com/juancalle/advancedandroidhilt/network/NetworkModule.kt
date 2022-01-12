package com.juancalle.advancedandroidhilt.network

import dagger.Module
import dagger.Provides
import okhttp3.Call
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

@Module
@DisableInstallInCheck
object NetworkModule {
    @Provides
    @Singleton
    fun providOkHttp(): Call.Factory = OkHttpClient.Builder()
        .build()

    @Provides
    @Named("base_url")
    fun provideBaseUrl(): String = "https://api.github.com/"
}