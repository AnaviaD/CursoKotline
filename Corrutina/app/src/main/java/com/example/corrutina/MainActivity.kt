package com.example.corrutina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var primerText      : TextView? = null
    var primerR         : TextView? = null

    var primerB         : Button? = null
    var contador        : Int? = 1

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Text View's
        primerText = findViewById(R.id.primerTextLayout)
        primerR = findViewById(R.id.textResultado)

        primerText?.setText("Hello World " +
                "\n BARCO BASURERO" +
                "\n jajajaja")


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