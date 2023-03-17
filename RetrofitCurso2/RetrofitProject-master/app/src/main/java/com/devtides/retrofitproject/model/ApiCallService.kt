package com.devtides.retrofitproject.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiCallService {

    private val BASE_URL = "http://10.1.1.244:82/api/Intercambio/GetIntercambioUnidad"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiCall::class.java)

    fun call()=
        api.callGet()

}