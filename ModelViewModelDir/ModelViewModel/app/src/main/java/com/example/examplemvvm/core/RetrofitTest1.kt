package com.example.examplemvvm.core

import com.example.examplemvvm.data.network.BasicAuthInterceptor
import com.google.gson.GsonBuilder
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitTest1 {
    fun getRetrofit(): Retrofit {

        val dispatcher = Dispatcher()
        dispatcher.maxRequests = 3

        val client = OkHttpClient.Builder()
            .dispatcher(dispatcher)
            .retryOnConnectionFailure(true)
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()

        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl("https://10.0.2.2:7036/android/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }
}