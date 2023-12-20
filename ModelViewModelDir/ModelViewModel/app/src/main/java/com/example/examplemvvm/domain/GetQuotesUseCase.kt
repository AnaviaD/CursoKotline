package com.example.examplemvvm.domain

import com.example.examplemvvm.data.Class.TractoJson
import com.example.examplemvvm.data.Class.users
import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): TractoJson? {
        return repository.getAllQuotes()
    }

    suspend fun getUsersNew():users?{
        return repository.getOneUser()
    }

}