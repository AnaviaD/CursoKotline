package com.example.viewstest

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.blue
import androidx.core.widget.addTextChangedListener

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


        var etEjemplo = findViewById<EditText>(R.id.etEjemplo)
        etEjemplo.addTextChangedListener {
            var inicio:Int
            var fin:Int
            inicio = etEjemplo.selectionStart
            fin = etEjemplo.selectionEnd
            println("La variable inicio: ${inicio} ")
            println("La variable fin: ${fin}")
            println("Valor: ${etEjemplo.text.toString()}")
            if (etEjemplo.text.length == 0) etEjemplo.setError("Campo vacio")
        }


        var autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        var countries: Array<String> = resources.getStringArray(R.array.countries_array)
        var adapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, countries)

        autoCompleteTextView.setAdapter(adapter)

    }
}