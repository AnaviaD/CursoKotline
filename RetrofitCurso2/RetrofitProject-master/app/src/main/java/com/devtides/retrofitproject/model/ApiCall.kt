package com.devtides.retrofitproject.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiCall {
    //@Headers( "Authorization: UlRGOGc2NFBNeHc6U2xuaDhlNnNYRlc=")
    @GET("GetIntercambioUnidad")
    fun callGet(@Query("unidad") n: String?): Call<ApiCallResponse>
}