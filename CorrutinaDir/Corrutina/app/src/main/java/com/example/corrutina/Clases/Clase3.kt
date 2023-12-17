package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val TAG = "Clase 3"
class Clase3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase3)

        /*
        GlobalScope.launch(Dispatchers.Main) {

        }
        */

        //Runblock creo detiene los threads para hacer esto
        Log.d(TAG, "Before the delay")
        runBlocking {

            launch (Dispatchers.IO){
                delay(2000L)
                Log.d(TAG, "Corrutina IO 1 Terminada")
            }

            launch (Dispatchers.IO){
                delay(2000L)
                Log.d(TAG, "Corrutina IO 2 Terminada")
            }

            Log.d(TAG, "Start of run Blocking")
            //No superara el tiempo de los 5 seg o android lo detecta como error fatal
            delay(3000L)
            Log.d(TAG, "End of run Blocking")
        }
        Log.d(TAG, "After run Blocking")
    }
}