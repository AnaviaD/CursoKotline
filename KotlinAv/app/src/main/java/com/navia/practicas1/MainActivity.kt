package com.navia.practicas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //Funciones de extension
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Funcion de extension
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


    }
}