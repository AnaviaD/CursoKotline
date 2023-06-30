package com.Navia.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "05/06/1998"

        /*
        var nombre: String = "jota"

        nombre = "adrian"

        println(fecha)
        println("Hola" + nombre)
        */

        var mes = fecha.subSequence(3, 5).toString().toInt()

        when(mes){
            asdfa
        }


    }
}