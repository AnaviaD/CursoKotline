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
        retirar_dinero(200f)

        //Marca error porque especificamos que sea de tipo String
        //var recibos: Array<String> = arrayOf(3.toString(), 4.toString(), "gas")
        var recibos: Array<String> = arrayOf("luz", "agua", "gas")
        recorrer_array(recibos)

        var matriz = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6,2,3),
            intArrayOf(7,8,9,4,5,6,7)
        )

        for (i in (0 until matriz.size)){
            println()
            for (j in (0 until matriz[i].size))
                println("Posicion [$i][$j]: ${matriz[i][j]}")
        }

        //Conjunto de datos
        //Conjunto de datos
        var clientesVIP: Set<Int> = setOf(1234, 5678, 4040)
        val setMezclado = setOf(2, 4.454, "casa", "c")

        println("clientes VIP: \n")
        println(clientesVIP)
        println("Numero de clientes VIP: ${clientesVIP.size}")

        if (clientesVIP.contains(1234)) println("1234 es VIP")
        if (clientesVIP.contains(1235)) println("1235 es VIP")
        //Conjunto de datos
        //Conjunto de datos

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
        println("Se ha ingresado $cantidad $moneda")
        mostrar_saldo()
    }

    fun retirar_dinero(cantidad: Float){
        if (verificarCantidad(cantidad)){
            saldo -= cantidad
            println("Se ha hecho una retirada de $cantidad $moneda")
            mostrar_saldo()
        }
        else println("Cantidad superior al saldo. Porfavor no sea pobre")

    }

    @Suppress("RedundantIf")
    fun verificarCantidad(cantidad: Float):Boolean{
        if (cantidad > saldo) return false
        else return true
    }

    fun recorrer_array(arrayL: Array<String>){
        for (i in arrayL)
            println(i)

        for (i in arrayL.indices)
            println(arrayL.get(i))

        for (i in 0 ..arrayL.size -1)
            println("${i+1}: ${arrayL.get(i)}")
    }

}