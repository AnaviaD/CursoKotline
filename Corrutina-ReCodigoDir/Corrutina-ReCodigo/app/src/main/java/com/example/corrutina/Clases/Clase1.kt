package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.Duration
import kotlin.time.measureTime

class Clase1 : AppCompatActivity() {

    val TAG = "Clase1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase1)

        runFirst()
        runSecond()

    }

    private fun log(msg: String)
    {
        Log.d(TAG, "Thread: ${Thread.currentThread().name} - $msg")
    }


    fun runFirst()
    {
        GlobalScope.launch(Dispatchers.Default) {
            val time: kotlin.time.Duration = measureTime {
                delay(1000L)
                log("Que hilo es este?")
            }
            Log.d(TAG, "duration: ${time.inWholeMilliseconds}")
        }
    }

    fun runSecond()
    {
        GlobalScope.launch(Dispatchers.Default) {
            delay(2000L)
            log("tercero")
        }
        GlobalScope.launch(Dispatchers.Default) {
            delay(1000L)
            log("segundo")
        }
        log("Se supone esto va primero")
    }

}