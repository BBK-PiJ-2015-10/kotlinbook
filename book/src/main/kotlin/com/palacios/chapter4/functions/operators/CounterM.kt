package com.palacios.chapter4.functions.operators

class CounterM(var k: Int) {

    operator fun plusAssign(j: Int): Unit {
        k += j
    }
}