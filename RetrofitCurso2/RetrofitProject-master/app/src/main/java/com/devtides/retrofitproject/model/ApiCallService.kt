package com.devtides.retrofitproject.model

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiCallService {

    private val BASE_URL = "http://10.1.1.244:82/api/Intercambio/"

    val client =  OkHttpClient.Builder()
        .addInterceptor(BasicAuthInterceptor("RTF8g64PMxw","Slnh8e6sXFW"))
        .build()
    val gson = GsonBuilder()
        .setLenient()
        .create();

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()
        .create(ApiCall::class.java)

    fun call()=
        api.callGet("TR2040")

}