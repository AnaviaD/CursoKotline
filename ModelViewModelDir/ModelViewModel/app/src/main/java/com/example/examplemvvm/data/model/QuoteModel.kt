package com.example.examplemvvm.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel
    (
    @SerializedName("name") val quote: String,
    @SerializedName("country") val author: String
)


