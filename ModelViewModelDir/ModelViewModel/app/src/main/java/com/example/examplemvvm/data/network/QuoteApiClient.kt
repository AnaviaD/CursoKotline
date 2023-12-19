package com.example.examplemvvm.data.network

import com.example.examplemvvm.data.Class.TractoJson
import com.example.examplemvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("GetIntercambioUnidad?unidad=TR2018")
    suspend fun getAllQuotes(): Response<TractoJson>
}