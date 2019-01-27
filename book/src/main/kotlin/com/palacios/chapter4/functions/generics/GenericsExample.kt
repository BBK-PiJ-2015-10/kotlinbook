@file:JvmMultifileClass
@file:JvmName("MyUtis")
package com.palacios.chapter4.functions.generics

import sun.security.ssl.SSLContextImpl
import java.util.Random;

fun main(args: Array<String>) {

    println(choose("ale","palacios","otero"))

}


fun <T> choose(t1: T, t2: T, t3:T) : T {
    return when (Random().nextInt(3)) {
        0 -> t1
        1 -> t2
        else -> t3
    }
}