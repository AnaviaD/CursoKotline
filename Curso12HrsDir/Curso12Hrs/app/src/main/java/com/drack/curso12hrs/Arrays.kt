package com.drack.curso12hrs

fun main(){
    var name    :String ="ArisDevs"
    var name2   :String ="ArisDevs"
    var name3   :String ="ArisDevs"
    var name4   :String ="ArisDevs"
    var name5   :String ="ArisDevs"

    val weekDays    = arrayOf("Lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println("El valor de la cadena es : " + weekDays.size)
    println(weekDays[0])

    //Bucles para Arrays
    for(position in weekDays.indices)
    {
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex())
    {
        println("La posicion $position contiene $value")
    }

    for(day in weekDays){
        println("Ahora es $day")
    }

}