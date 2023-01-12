package com.example.newpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num: Int
        var jota: Person = Person("Jota", "A2345243DSFE")
        var anonimo: Person = Person("anon", "")
        println(jota.alive)
        jota.die()
        println(jota.alive)
        jota.liveAgain()
        println(jota.alive)
        println(jota.nombre)
        println(jota.passport)
        println(anonimo)
        println(anonimo.alive)
        println(anonimo.nombre)
        println(anonimo.passport)

        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        bicho.setName("Noivrn")
        println(bicho.getName())
        bicho.setAttakPower(450f)
        println(bicho.getAttackPower())
        bicho.setLife(300f)
        println(bicho.getLife())

    }
}