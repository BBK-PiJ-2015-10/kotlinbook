
@file:JvmName("MyUtilities")
package com.palacios.chapter4.functions

import java.math.BigDecimal
import java.math.RoundingMode

//Example of top level function, similar to static function in Java
fun fizzbuzz(start: Int, end: Int): Unit {

    for (k in start..end){
        fun isFizz() = k % 3 == 0
        fun isBuzz() = k % 5 == 0
        when {
            isFizz() && isBuzz() -> println("FizzAndBuzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> println(k)
        }
    }
}

fun divide(divisor: BigDecimal, scale: Int = 0, roundingMode: RoundingMode = RoundingMode.UNNECESSARY) : Unit {
}

fun <E> List<E>.dropper(k: Int): List<E> {
    val resultSize = this.size - k
    when {
        resultSize <=0 -> return emptyList<E>()
        else -> {
            val list = ArrayList<E>(resultSize)
            for (index in k..this.size-1){
                list.add(this[index])
            }
            return list
        }
    }
}
