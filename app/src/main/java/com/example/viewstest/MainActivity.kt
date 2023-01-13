package com.example.viewstest

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.blue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvEjemplo = findViewById<TextView>(R.id.tvEjemplo)

        tvEjemplo.apply {
            text = "Cambiado desde Codigo"
            setTextColor(Color.RED)
            setTypeface(Typeface.MONOSPACE, Typeface.BOLD)
            setOnClickListener{
                setTextColor(Color.GREEN)
                text = "No traigo mandados"
            }
        }

    }
}