package com.example.examplemvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteModel
import com.example.examplemvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    //LiveData permite al activity suscribirse a un modelo de
    //datos que se llame automaticamente cuando se realice un cambio
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        //Esta funcion va a ser llamada por la activity
        //Cuando el usuario toque la pantalla, va a hacer un onClickListener para llamar esta funcion
        //Deste el activity llamamos al viewModel y esta funcion

        val currenQuote = QuoteProvider.random()
        //PostValue es importante porque es el que avisa y desencadena las acciones
        quoteModel.postValue(currenQuote)
    }

}