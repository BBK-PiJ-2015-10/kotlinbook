package com.palacios.chapter5

fun main(args: Array<String>) {

    //Examples of HOF
    //foo("alejo",{it.reversed()})

    //val ints = listOf(1,2,3,4,5,6)
    //val odds = ints.filter { it % 2 == 1 }
    //val evens = ints.filter { it % 2 == 0 }

    //println(evens)

    //val reversi = bar()
    //println(reversi("hello"))

    //val ints = listOf(1,2,3,4,5,6)
    //val odds = ints.filter(modulo(1))
    //val even = ints.filter(modulo(2))
    //val mod3 = ints.filter(modulo(3))

    //Examples of function assignment
    //val isEven : (Int) -> Boolean = {it % 2 == 0}

    //val isEvon = {k :Int -> k % 2 == 0}


}


fun foo(str: String, fn: (String)-> String): Unit {
    val applied = fn(str)
    println(applied)
}

fun bar():(String)-> String= { str -> str.reversed()}

fun modulo(k: Int): (Int)-> Boolean = { it % k == 0}