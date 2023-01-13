package com.example.viewstest

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvEjemplo = findViewById<TextView>(R.id.tvEjemplo)
        tvEjemplo.text = "Cambiado desde Codigo"
        tvEjemplo.setTextColor(Color.RED)
        tvEjemplo.setTypeface(Typeface.MONOSPACE, Typeface.BOLD)

    }
}