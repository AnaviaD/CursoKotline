package com.devtides.retrofitproject.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiCall {
    @GET("GetIntercambioUnidad")
    fun callGet(): Call<ApiCallResponse>
}