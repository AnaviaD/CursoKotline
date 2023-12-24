package com.drack.curso12hrs


/*========== variables de la clase ==========*/
val a   :Int    = 0
val b   :String ="holis"

fun main()
{
    /*======== variables de funcion ========*/
    print("Hola k ase\n")

    //Int -2, 147, 564, 0
    val age     :Int    = 5
    val cAge = showMyAge(age)?: 1
    println(cAge)

    //Long -9, 200, 66,
    val exampl  :Long = 60

    //Float
    val floatExample    :Float  = 2.21f

    //Char solo un caracter
    val charExample1    :Char   = 'e'

    //String todo lo que quieras bb
    val stringExample   :String = "asdf"

    //Boolean
    val booleanExample  :Boolean = true


}

fun showMyAge(currentAge    :Int = 30):Int
{
    return currentAge + 1;
}