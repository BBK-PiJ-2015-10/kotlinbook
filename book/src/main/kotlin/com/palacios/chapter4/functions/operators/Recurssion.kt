package com.palacios.chapter4.functions.operators

fun main(args: Array<String>) {

    println(fact(7))

    println(factTR(7))

}

fun fib(k: Int): Int = when (k) {
    0 -> 1
    1 -> 1
    else -> 3
}

fun fact(k:Int): Int = when (k){
    0 -> 1
    else -> k * fact(k-1)
}

fun factTR(k:Int): Int  {
    tailrec fun helper(value: Int, accumulator: Int): Int = when (value) {
        0 -> accumulator
        else -> helper(value-1,accumulator * value)
    }
    return helper(k,1)
}


fun factAux(l: Int, r: Int): Int = when (r) {
    0 -> l
    else -> factAux(l*r,r-1)
}