package com.example.examplemvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.examplemvvm.R
import com.example.examplemvvm.databinding.ActivityMainBinding
import com.example.examplemvvm.ui.viewModel.QuoteViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //Esta capa la llamaria yo la capa logica
    //Esta simple asignacion nos proporciona todas las conexiones con ciclos de vida
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        quoteViewModel.onCreate()




        //Accedemos a la capa logica
        //Para echar a andar un observer necesitamos mandarle this que quiere decir que nos pertenece
        //Teoria, podriamos intentar mandar otro activity o fragment como owner
        //currentQuote es el nuevo valor u objeto que se renovara por interaccion
        quoteViewModel.tractoModel.observe(this, Observer { currentQuote ->
            println(currentQuote)
            //utilizamos el binding que no es mas que dejar de utilizar variables para los elementos
            //y tomarlos como tal por su id
            //currentQuote.quote tomamos el objeto actual y accedemos a sus propiedades
            //currentQuote.quote
            //currentQuote.author
            //binding.tvQuote.text = currentQuote.quote
            //binding.tvAuthor.text = currentQuote.author
        })
        //Lo que hace la funcion de arriba es que cada vez que exista un cambio, va a llegar aqui
        //lo que quiere decir que mantiene una linea de vida con respecto al activity y recibe cambios desde la capa de negocios o capa logica


        //Por ultimo vamos a declarar un onClickListener que va a llamar a una funcion seguramente
        /*binding.vieWContainer.setOnClickListener {
            //Aqui lo que hacemos es llamar al viewModel parte logica
            //La funcion que declaramos que se encarga de tomar el LiveData y
            //actualizarlo que a su ves estara observado por quoteViewModel.quoteModel
            quoteViewModel.randomQuote()
        }
        */

        quoteViewModel.userModel.observe(this, Observer { currentUser ->
            println(currentUser)
        })

    }
}