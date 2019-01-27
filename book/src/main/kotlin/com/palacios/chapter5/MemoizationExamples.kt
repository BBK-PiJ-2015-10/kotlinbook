package com.palacios.chapter5

import java.util.concurrent.ConcurrentHashMap

fun main(args: Array<String>) {

}


fun fib(k : Int) : Long = when (k) {
    0 -> 1
    1 -> 1
    else -> fib(k-1) + (k-2)
}

val map = mutableMapOf<Int,Long>()

fun fibM(k: Int): Long {
    return map.getOrPut(k){when(k){
        0 ->1
        1 ->1
        else -> fib(k-1)+fib(k-2)
    }}
}

fun <A,R> memoize(fn: (A) -> R): (A) -> R {
    val mapo = ConcurrentHashMap<A,R>()
    return { a -> mapo.getOrPut(a){ fn(a) } }
}