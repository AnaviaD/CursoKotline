package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

class Clase4 : AppCompatActivity() {

    val TAG = "Clase4"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase4)

        /*
        //================================Ejemplo1================================
        //================================Ejemplo1================================
        // Este cofigo se ejecuto al momento de entrar a al onCreate
        val job = GlobalScope.launch (Dispatchers.Default){
            repeat( 5){
                Log.d(TAG, "Main Thread is continuing")
                delay(500L)
            }
        }

        //Vamos a detener todo hasta que este job este realizado
        runBlocking {
            //Despues de que se inicie de forma automatica, despues de un segundo se detiene
            delay(1000L)
            job.cancel()
            Log.d(TAG, "El trabajo ha sido cancelado")
        }
        //================================Ejemplo1================================
        //================================Ejemplo1================================
        */


        //================================Ejemplo2================================
        //================================Ejemplo2================================
        val job = GlobalScope.launch (Dispatchers.Default){
            Log.d(TAG, "Starting long running calculation...")

            withTimeout(4000L)
            {
                for (i in 30..40){
                    if (isActive)
                    {
                        Log.d(TAG, "Result for i = $i: ${fib(i)}")
                    }
                }
            }
            Log.d(TAG, "Ending long calculation...")
        }

        //================================Ejemplo2================================
        //================================Ejemplo2================================

    }

    //================================Ejemplo2================================
    //================================Ejemplo2================================
    //Funcion recursiba
    fun fib(n: Int): Long
    {
        return  if(n == 0) 0
        else if(n == 1) 1
        else fib(n - 1) + fib(n - 1)
    }
    //================================Ejemplo2================================
    //================================Ejemplo2================================
}