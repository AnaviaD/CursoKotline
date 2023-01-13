package com.example.newpoo

import android.widget.Toast

open class Pokemon( protected var name:String = "Pok",
                    protected var attackPower: Float = 30f,
                    protected var life: Float = 100f)
    {
    fun Pokemon(n: String, aP: Float, l: Float){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        //this.sayHi()
    }

    internal fun getName(): String{ return this.name}
    internal fun getAttackPower(): Float{ return this.attackPower}
    internal fun getLife(): Float{ return this.life}

    internal fun setName(nam: String){ this.name = nam}
    internal fun setAttakPower(pow: Float){ this.attackPower = pow}
    internal fun setLife(l: Float){ this.life = l}

    //fun sayHi(){ Toast.makeText(maincontext, "Hola!! Soy $name", Toast.LENGTH_LONG).show()}

    fun cure(){this.life = 100f}

    fun evolve(n: String){
        this.name = n
        this.attackPower *= 1.20f
        //this.sayHi()
    }

    //fun attack(){ Toast.makeText(maincontext, "Al toque prro", Toast.LENGTH_LONG).show()}
    open fun attack(){ println("Ataque")}
}

class WaterPokemon(n: String = "WPoke", aP: Float = 30f, l: Float = 100f)
    : Pokemon(n, aP, l)
{
    private var maxResistence: Int = 500
    private var submergedTime: Int = 0

    //public var life: Float = 100f

    fun WaterPokemon(n: String, aP: Float, mR: Int){
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.maxResistence = mR
        //this.sayHi()
    }

    fun breathe() { this.submergedTime = 0}
    fun inmerse() { this.submergedTime++ }

    override fun attack(){ println("Ataque con agua")}
}