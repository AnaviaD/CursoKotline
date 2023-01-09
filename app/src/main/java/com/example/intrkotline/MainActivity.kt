package com.example.intrkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda: String = "EUR"
    }
    var saldo: Float = 300.54f
    var sueldo = 764.82
    var entero: Int = 62
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha: String = "05/06/1990"
        var nombre: String = "jota"
        var vip: Boolean = false
        var inicial: Char = 'J'

        var saludo: String = "Hola " + nombre + " " + saldo.toString()


        println(fecha)
        println("Hola " + nombre)
        println(saludo)

    }
}