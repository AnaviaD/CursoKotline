package com.example.examplemvvm.data.network

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthInterceptor(username: String, password: String): Interceptor {
    private var credentials: String = Credentials.basic(username, password)


    override fun intercept(chain: Interceptor.Chain): Response {
        var request =
            chain.request().newBuilder()
            .header("Authorization", credentials)
            .addHeader("Connection", "close")
            .build()
        return chain.proceed(request)
    }
}