package com.example.basicrvw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "05/06/1990"
        var nombre = "jota"

        var recibos: Array<Int> = arrayOf(1, 2, 2, 3, 4, 5)
        var arraString: Array<String> = arrayOf("Comer", "dormir", "jaus juas jaus")

        var Persona =  Person("juan", 21, arraString)
        Persona.imprimir_Datos()

        mostrar_array(recibos)

        println("Hola " + nombre)

        nombre = "jj"

        mostrar_nombre(nombre)
    }

    fun mostrar_nombre(nombre: String){
        println("Hola " + nombre)
    }

    fun mostrar_saldo(saldo: Int)
    {
        println("Tu saldo es de $saldo")
    }

    fun mostrar_array(arr: Array<Int>)
    {
        for (i in arr){
            println(i)
        }

    }
}