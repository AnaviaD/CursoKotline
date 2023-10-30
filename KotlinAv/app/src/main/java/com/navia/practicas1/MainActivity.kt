package com.navia.practicas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //1Funciones de extension
    /*
    private fun String.noSpace():String{
        return this.replace(" ", "")
    }

    private fun IntArray.show(){
        println("[")
        for (i in this) println("${i}")
        println("]")
    }
    */


    //Funsiones de orden Superior
    private fun calculadora(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int{
        return fn(n1, n2)
    }

    private fun suma(x: Int, y: Int):Int { return x+y}
    private fun resta(x: Int, y: Int):Int { return x-y}
    private fun miltiplica(x: Int, y: Int):Int { return x*y}
    private fun divide(x: Int, y: Int):Int { return x/y}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1Funcion de extension
        /*
        var usuario = "        Soy     yo    "
        println("${usuario} (${usuario.length}) - ${usuario.noSpace()} (${usuario.noSpace().length})")
        //Funcion de extension


        var array1: Array<Int> = arrayOf(5,4,3,2,1)
        var array2 = IntArray(3)
        array2[0] = 10
        array2[1] = 20
        array2[2] = 30
        println("array2: "); array2.show()
        var array3: IntArray = intArrayOf(1,2,3,4,5)
        */

        //Funciones de Orden Superior
        println("Suma        80 + 20 = ${calculadora(80, 20, ::suma)}")
        println("Resta       50 - 10 = ${calculadora(50, 10, ::suma)}")
        println("Producto    7 * 7  = ${calculadora(7, 7, ::suma)}")
        println("Division    12 / 3 = ${calculadora(12, 3, ::suma)}")


    }
}