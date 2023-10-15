package com.example.corrutina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.corrutina.Clases.Clase1
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var primerText      : TextView? = null
    var primerR         : TextView? = null

    var primerC         : Button? = null
    var contador        : Int? = 1

    val TAG = "MainActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Text View's
        primerText      = findViewById(R.id.primerTextLayout)
        primerR         = findViewById(R.id.textResultado)

        // Botones
        primerC         = findViewById(R.id.Clase1)

        primerText?.setText("Hello World " +
                "\n BARCO BASURERO" +
                "\n jajajaja")

        GlobalScope.launch {
            delay(10000L)
            Log.d(TAG, "Corrutina Hello from thread ${Thread.currentThread().name}")
        }
        Log.d(TAG, "Hello from thread ${Thread.currentThread().name}")

        primerC?.setOnClickListener{
            val intent = Intent(this, Clase1::class.java)
            startActivity(intent)
        }


    }

    fun funcionMas(View:View)
    {
        contador = contador!! + 1
        primerR?.setText("$contador ")
    }

    fun funcionMenos(View:View)
    {
        contador = contador!! - 1
        primerR?.setText("$contador ")
    }
}