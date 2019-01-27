package com.palacios.chapter10

import io.kotlintest.matchers.haveLength
import io.kotlintest.specs.FunSpec

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import io.kotlintest.matchers.should
import io.kotlintest.matchers.include
import java.lang.IllegalArgumentException


fun squareRoot(k: Int): Int {
    require (k >=0)
    return Math.sqrt(k.toDouble()).toInt()
}


class myFunSpec : FunSpec() {

    init{
        test("should pass like a champ"){
            "helloWorld".startsWith("hello") shouldBe true
        }
    }

    init {
        test("a negative input should throw an exception") {
            shouldThrow<IllegalArgumentException> {
                squareRoot(-1)
            }
        }
    }

    init {
        test("testing the combination of matchers") {
            val thisString = "hello world"
            thisString should (haveLength(11) and include("llw wor"))
        }
    }


}