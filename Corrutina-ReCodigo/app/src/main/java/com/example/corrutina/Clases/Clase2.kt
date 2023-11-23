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

        GlobalScope.launch {
            val networkCallAnswer       =   doNetworkCall()
            val networkCallAnswer2      =   doNetworkCall2()

            Log.d(TAG, networkCallAnswer)
            Log.d(TAG, networkCallAnswer2)

            Log.d(TAG, "Thread: ${Thread.currentThread().name}")
        }

        RespuestaC2 = findViewById(R.id.txtRespuesta1)
    }

    suspend fun doNetworkCall(): String{
        delay(3000L)
        return "Esta es respuesta de doNetworkCall"
    }

    suspend fun doNetworkCall2(): String{
        delay(3000L)
        return "Esta es respuesta de doNetworkCall 2"
    }

}