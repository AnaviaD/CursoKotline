package com.example.examplemvvm.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplemvvm.data.Class.TractoJson
import com.example.examplemvvm.data.Class.users
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {
    //LiveData permite al activity suscribirse a un modelo de
    //datos que se llame automaticamente cuando se realice un cambio
    val tractoModel = MutableLiveData<TractoJson?>()
    val userModel   = MutableLiveData<users?>()

    var getQuotesUseCase = GetQuotesUseCase()

    fun randomQuote() {

    }

    fun onCreate() {
        /*viewModelScope.launch {
            val result = getQuotesUseCase()

            tractoModel.postValue(result)
        }
        */

        viewModelScope.launch {
            val result = getQuotesUseCase.getUsersNew()
            userModel.postValue(result)
        }
    }

}