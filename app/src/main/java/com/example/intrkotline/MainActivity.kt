package com.example.intrkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda: String = "EUR"
    }
    var saldo: Float = 300.54f
    var sueldo: Float = 764.82f
    var entero: Int = 62
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha: String = "05/06/1990"
        var nombre: String = "jota"
        var vip: Boolean = false
        var inicial: Char = 'J'

        var saludo: String = "Hola " + nombre + " " + saldo.toString()
        if(vip == true) saludo += "Te queremos mucho"
        else saludo += "Quieres ser vip prro?"


        println(fecha)
        println("Hola " + nombre)
        println(saludo)

        var a:Int = 5 + 5 //10
        val b:Int = 10 - 2
        val c:Int = 3 * 4
        val d:Int = 10 / 5
        val e:Int = 10 % 3  //1, no se puede obtener el resto despues del punto
        val f:Int = 10 / 6  //1, division infinita, solo se mantiene la parte entera

        var aPreIncremento: Int = 5
        var bPreDecremento: Int = 5
        var cPostIncremento: Int = 5
        var dPostDecremento: Int = 5

        //Influye en que posicion esta el  ++ o --
        println(aPreIncremento)
        println(++aPreIncremento)
        println(aPreIncremento)

        println(bPreDecremento)
        println(--bPreDecremento)
        println(bPreDecremento)

        println(cPostIncremento)
        println(cPostIncremento--)
        println(cPostIncremento)

        println(dPostDecremento)
        println(dPostDecremento++)
        println(dPostDecremento)

        saldo += sueldo

        a==b



    }
}