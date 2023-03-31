package com.example.basicrvw

class Person(var nombre: String, var edad: Int, var Ocupaciones: Array<String>) {
    fun Person(){
        this.nombre = nombre
        this.edad = edad
        this.Ocupaciones = Ocupaciones
    }

    fun imprimir_Datos()
    {
        println("Hola $nombre como estas, supongo que tu edad es $edad")
    }


}