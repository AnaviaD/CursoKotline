package com.example.examplemvvm.data.network.Quote

import com.example.examplemvvm.core.RetrofitHelper
import com.example.examplemvvm.data.Class.TractoJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): TractoJson? {
        return withContext(Dispatchers.IO)
        {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body()
        }
    }
}