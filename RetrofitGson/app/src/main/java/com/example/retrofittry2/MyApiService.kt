package com.example.retrofittry2

import retrofit2.Call
import retrofit2.http.*


public interface MyApiService {

    @GET("diseases")
    fun getDiseases(): Call<DiseasesResponse?>?

    @FormUrlEncoded
    @POST("upload/photo")
    fun postPhoto(
        @Field("image") base64: String?,
        @Field("extension") extension: String?,
        @Field("user_id") user_id: String?
    ): Call<SimpleResponse?>?

    @GET("login")
    fun getLogin(
        @Query("username") username: String?,
        @Query("password") password: String?
    ): Call<LoginResponse?>?

    @FormUrlEncoded
    @POST("product")
    fun postNewProduct(
        @Field("code") code: String?,
        @Field("name") name: String?,
        @Field("description") description: String?
    ): Call<SimpleResponse?>?
}