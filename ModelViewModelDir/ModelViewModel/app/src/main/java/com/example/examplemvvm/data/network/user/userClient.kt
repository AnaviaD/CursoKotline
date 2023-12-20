package com.example.examplemvvm.data.network.user

import com.example.examplemvvm.data.Class.users
import retrofit2.Response
import retrofit2.http.GET

interface userClient {
    @GET("users")
    suspend fun getOneUser(): Response<users>
}