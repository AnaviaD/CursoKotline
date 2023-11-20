package com.example.corrutina.Clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.util.Log
import com.example.corrutina.R
import kotlinx.coroutines.CoroutineScope
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

    }

    fun runFirst(){
        GlobalScope.launch {
            val time: kotlin.time.Duration = measureTime {
                Log.d(TAG, "print this NOW")
                delay(1000L)
                Log.d(TAG, "print this after 1 second ")
            }
            Log.d(TAG, "duration: ${time.inWholeMilliseconds}")
        }
    }

}