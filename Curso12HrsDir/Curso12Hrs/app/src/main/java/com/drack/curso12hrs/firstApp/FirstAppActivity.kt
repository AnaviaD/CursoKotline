package com.drack.curso12hrs.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.drack.curso12hrs.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnClick = findViewById<AppCompatButton>(R.id.button)

        btnClick.setOnClickListener {
            println("boton pulsado")
        }
    }
}