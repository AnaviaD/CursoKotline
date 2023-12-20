package com.example.examplemvvm.data

import com.example.examplemvvm.data.Class.TractoJson
import com.example.examplemvvm.data.Class.users
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.data.model.UserProvider
import com.example.examplemvvm.data.network.Quote.QuoteService
import com.example.examplemvvm.data.network.user.userService

class QuoteRepository {

    private val api         = QuoteService()
    private val userApi     = userService()

    suspend fun getAllQuotes(): TractoJson? {
        val response = api.getQuotes()
        //QuoteProvider.quotes = response
        return response
    }

    suspend fun getOneUser(): users? {
        val response = userApi.getOneUserService()
        UserProvider.user = response
        return response
    }
}