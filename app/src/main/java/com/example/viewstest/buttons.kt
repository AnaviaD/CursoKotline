package com.example.viewstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class buttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        var btBoton = findViewById<Button>(R.id.bt)
    }
}