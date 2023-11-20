package com.example.corrutina.Clases

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.corrutina.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Clase2 : AppCompatActivity() {

    val TAG = "Clase2"

    var RespuestaC2         : TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase2)

        RespuestaC2 = findViewById(R.id.txtRespuesta1)

        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG, "Starting Corrutine thread ${Thread.currentThread().name}")
            val answer = doNetworkCall()

            withContext(Dispatchers.Main){
                Log.d(TAG, "Seting text thread ${Thread.currentThread().name}")
                RespuestaC2?.setText(answer)
                Log.d(TAG, answer)
            }
        }
    }

    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is an answer"
    }

}