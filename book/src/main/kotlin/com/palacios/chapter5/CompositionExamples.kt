package com.palacios.chapter5

fun main(args: Array<String>) {

    val f = String::length
    val g = Any::hashCode

    val fog = composer(f,g)

    val fog2 = f * g


    println(fog("What is the hash of my length"))
}

fun <A,B,C> composer(fn1: (A)->B, fn2: (B)->C): (A) -> C = {a ->
    val b = fn1(a)
    val c = fn2(b)
    c
}

operator infix fun <P1, R, R2> Function1<P1, R>.times(fn: (R) -> R2): (P1) -> R2 = {
    fn(this(it))
}
