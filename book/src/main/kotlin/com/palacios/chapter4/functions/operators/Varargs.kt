package com.palacios.chapter4.functions.operators

fun main(args: Array<String>) {

    //multiprint("alejandro","palacios","otero")

    //multiprint2("Dr","Alejandro","Palacios")

    //multiprint3("Dr","Alejandro","Palacios",sufix="Culon")

    val examples = arrayOf("a","b","c","d")
    multiprint3("Dr",*examples,sufix="Culon")
}


fun multiprint(vararg strings: String) : Unit { for (k in strings) println(k) }

fun multiprint2(prefix: String, vararg values: String) : Unit {
    println("The prefix is : $prefix")
    for (value in values) println(value)
}

fun multiprint3(prefix: String, vararg values: String, sufix: String) : Unit {
    println("The prefix is : $prefix")
    for (value in values) println(value)
    println("The suffix is : $sufix")
}