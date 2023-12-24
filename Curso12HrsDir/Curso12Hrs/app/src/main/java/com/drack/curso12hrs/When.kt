package com.drack.curso12hrs

fun main()
{
    val arg     :Boolean    = false


    getMonth(2)
    getTrimestre(3)
    result(5)

}

fun result(value    :Any){
    when (value){
        is  Int     ->  println( getTrimestre(value))
        is String   ->  println("Es string")
        is Boolean  ->  if (value) println("El valor es Bool") else println("Adios perdedor")
    }
}

fun getTrimestre(trimestre: Int)    :String {
    return when (trimestre) {
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        7, 8, 9 -> "Tercer trimestre"
        10, 11, 12 -> "Cuarto trimestre"
        in 13..100 -> "Primer rango"
        else -> {
            "Eso no existe"
        }
    }
}


fun getMonth(month  :Int){
    when(month){
        1   ->  println("Enero")
        2   ->  println("Febrero")
        3   ->  println("Marzo")
        4   ->  println("Abril")
        5   ->  println("Mayo")
        6   ->  println("Junio")
        7   ->  println("Julio")
        8   ->  println("Agosto")
        9   ->  println("Septiembre")
        10   ->  println("Octubre")
        11   ->  {
            println("Noviembre")
            println("Noviembre2")
        }
        12   ->  println("Diciembre")
        else -> println("Eso no existe ")
    }
}