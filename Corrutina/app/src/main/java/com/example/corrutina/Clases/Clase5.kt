package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Clase5 : AppCompatActivity() {

    val TAG = "Clase5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase5)

        /*
        // Intentamos ejecutar el GlobalScope y termina una tarea para que comience la otra
        // Como se puede ver en las funciones una dura 2s y otra 3s por lo que conjuntamente nos daria 5s
        // Lo que buscamos es que se ejecuten en hijos diferentes para poder bajar de 5s a 3s
        //=============================Ejercicio1=============================
        GlobalScope.launch (Dispatchers.IO)
        {
            val time = measureTimeMillis {
                val answer1 = networkCall1()
                val answer2 = networkCall2()

                Log.d(TAG, "Answer1 is $answer1")
                Log.d(TAG, "Answer2 is $answer2")
            }
            Log.d(TAG, "Request took  $time ms.")
        }
        //=============================Ejercicio1=============================
        */


        /*
        //De esta forma podemos ahorrar tiempo ejecutando dos jobs distintos
        //El tiempo de procesamiento general se redujo de manera significativa de 5s a 3s
        //=============================Ejercicio2=============================
        GlobalScope.launch (Dispatchers.IO)
        {
            val time = measureTimeMillis {
                var answer1 :String? = null
                var answer2 :String? = null

                val job1 = launch { answer1 = networkCall1() }
                val job2 = launch { answer2 = networkCall2() }

                job1.join()
                job2.join()

                Log.d(TAG, "Answer1 is $answer1")
                Log.d(TAG, "Answer2 is $answer2")
            }
            Log.d(TAG, "Request took  $time ms.")
        }
        //=============================Ejercicio2=============================
        */

        //Forma correcta de hacer alguna llamada async
        //=============================Ejercicio3=============================
        GlobalScope.launch (Dispatchers.IO)
        {
            val time = measureTimeMillis {


                val answer1 = async { networkCall1() }
                val answer2 = async { networkCall2() }

                Log.d(TAG, "Answer1 is ${answer1.await()}")
                Log.d(TAG, "Answer2 is ${answer2.await()}")
            }
            Log.d(TAG, "Request took  $time ms.")
        }
        //=============================Ejercicio3=============================


    }

    //=============================Ejercicio1=============================
    suspend fun networkCall1(): String{
        delay(3000L)
        return "Answer 1"
    }

    suspend fun networkCall2(): String{
        delay(2000L)
        return "Answer 2"
    }
    //=============================Ejercicio1=============================
}