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

        val fecha: String = "01/06/1990"
        var nombre: String = "jota"
        var vip: Boolean = false
        var inicial: Char = 'J'

        /*
        var saludo: String = "Hola " + nombre + " " + saldo.toString()
        if(vip == true) saludo += "Te queremos mucho"
        else saludo += "Quieres ser vip prro?"

        var dia:Int = fecha.subSequence(0, 2).toString().toInt()
        if (dia==1) ingresar_sueldo()
        var mes:Int = fecha.subSequence(3, 5).toString().toInt()

        when(mes){
            //1 ->
            1, 2, 3 -> println("\n En invierno no hay ofertas de inversiones")
            4, 5, 6 -> println("\n En primavera no hay ofertas de inversiones")
            7, 8, 9 -> println("\n En verano hay ofertas del 2.5")
            10,11,12 -> println("\n En otoño hay ofertas del 3.5")
            else -> println("\n revisa tus fechas :v")
        }

        println(saludo)

        var pin:Int = 1234
        var intentos:Int = 0
        var clave_ingresada:Int = 1232

        do{
            println("Ingresa el PIN: ")
            println("Clave ingresada: ${clave_ingresada++}")
            //Utilizar BREAK
            if (clave_ingresada == pin)break
            //Utilizar BREAK
            intentos ++
        }while ((intentos < 3) && (clave_ingresada != pin))

        if (intentos == 3) println("Tarjeta bloqueada")

         */

        mostrar_saldo()
        ingresar_dinero(50.00f)
        retirar_dinero(40f)

        retirar_dinero(50f)
        retirar_dinero(200f)
        /*
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
        */


    }

    fun mostrar_saldo(){
        println("Tienes $saldo $moneda")
    }

    fun ingresar_sueldo(){
        saldo += sueldo
        println("Se ha ingresado tu sueldo $sueldo $moneda")
        mostrar_saldo()
    }

    fun ingresar_dinero(cantidad: Float){
        saldo += cantidad
        println("Se ha ingresado $sueldo $moneda")
        mostrar_saldo()
    }

    fun retirar_dinero(cantidad: Float){
        if (verificarCantidad(cantidad)){
            saldo -= cantidad
            println("Se ha hecho una retirada de $sueldo $moneda")
            mostrar_saldo()
        }
        else println("Cantidad superior al saldo. Porfavor no sea pobre")

    }

    fun verificarCantidad(cantidad: Float):Boolean{
        if (cantidad > saldo) return false
        else return true
    }

}