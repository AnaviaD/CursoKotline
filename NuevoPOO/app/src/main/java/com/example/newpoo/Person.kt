package com.example.newpoo

//El ? significa que puede o no traer algun valor
class Person(var nombre:String = "Anonimo", var passport: String? = null) {
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