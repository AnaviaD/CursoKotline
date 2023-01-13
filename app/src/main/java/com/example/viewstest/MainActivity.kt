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
        tvEjemplo.text = "Cambiado desde Codigo"
        tvEjemplo.setTextColor(Color.RED)
        tvEjemplo.setTypeface(Typeface.MONOSPACE, Typeface.BOLD)

        tvEjemplo.setOnClickListener{
            Toast.makeText(this, "TextView Clicked", Toast.LENGTH_SHORT).show()
            tvEjemplo.setTextColor(Color.GREEN)
            tvEjemplo.text = "No traigo mandados"
        }
    }
}