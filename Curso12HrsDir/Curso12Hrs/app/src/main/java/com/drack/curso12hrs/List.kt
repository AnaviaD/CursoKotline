package com.drack.curso12hrs

fun main()
{
    mutableList()
}

fun mutableList()
{
    val weekDays    :MutableList<String>    = mutableListOf("Lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)
    //Le podemos dar el index al principio
    weekDays.add(0, "ArisTiDay")
    println(weekDays)
}

fun inmutableList()
{
    val readOnly    :List<String>   =   listOf("Lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    /*
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
    */

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach{   day ->  println(day)}
}