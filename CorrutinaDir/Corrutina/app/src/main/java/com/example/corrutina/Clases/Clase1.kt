package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Clase1 : AppCompatActivity() {

    val TAG = "Clase1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase1)

        GlobalScope.launch {
            val networkCallAnswer   = doNetworkCall()
            val networkCallAnswer2  = doNetworkCall2()

            Log.d(TAG, networkCallAnswer)
            Log.d(TAG, networkCallAnswer2)

        }
    }

    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is an answer"
    }

    suspend fun doNetworkCall2():String{
        delay(3000L)
        return "This is an answer from call 2"
    }
}