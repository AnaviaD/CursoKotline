package com.example.newpoo

//El ? significa que puede o no traer algun valor
//Se agrega el open para poder heredar
open class Person(var nombre:String = "Anonimo", var passport: String? = null) {
    var alive: Boolean = true

    fun Person(){
        nombre = "Juan"
        passport = "346WDGSD32567"
    }

    fun die(){
        alive = false
    }

    fun liveAgain(){
        alive = true
    }
}

class Athlete(nombre: String, passport: String?,var sport: String): Person(nombre, passport)