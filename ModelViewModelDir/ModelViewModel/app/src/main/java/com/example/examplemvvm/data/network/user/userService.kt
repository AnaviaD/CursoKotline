package com.example.examplemvvm.data.network.user

import com.example.examplemvvm.core.RetrofitTest1
import com.example.examplemvvm.data.Class.users
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class userService {
    private val retrofit = RetrofitTest1.getRetrofit()
    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        // Manejo de la excepción
        println("Excepción en la corrutina: $exception")
    }
    suspend fun getOneUserService():users{
        return withContext(Dispatchers.IO + exceptionHandler){
            val response = retrofit.create(userClient::class.java).getOneUser()
            response.body()?: users("meh", 0)
        }
    }
}