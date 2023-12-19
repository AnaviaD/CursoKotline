package com.example.examplemvvm.core

import com.example.examplemvvm.data.network.BasicAuthInterceptor
import com.google.gson.GsonBuilder
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object RetrofitHelper {
    fun getRetrofit(): Retrofit {

        val dispatcher = Dispatcher()
        dispatcher.maxRequests = 3

        val client = OkHttpClient.Builder()
            .dispatcher(dispatcher)
            .retryOnConnectionFailure(true)
            .addInterceptor(BasicAuthInterceptor("RTF8g64PMxw", "Slnh8e6sXFW"))
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()

        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl("http://10.1.1.244:82/api/Intercambio/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }
}