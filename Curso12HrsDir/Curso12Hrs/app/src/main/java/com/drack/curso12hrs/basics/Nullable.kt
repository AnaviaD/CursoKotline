package com.drack.curso12hrs.basics

fun main()
{
    var name:String?    = null

    //Nos podemos proteger de los nulos con ?:
    //Dandole oportunidad de ejecutar otra parte del codigo
    println(name?.get(2)    ?:  "Es nulo wey " + "mas este texto")
}