package com.palacios.chapter10

import io.kotlintest.properties.Gen
import io.kotlintest.specs.StringSpec
import io.kotlintest.properties.forAll
import kotlin.random.Random

class PropertyExample : StringSpec(){

    init {

        "String.size" {
            forAll({ a: String, b: String -> (a + b).length == a.length + b.length })
        }

        // example with a manual generator
        "squareRoot" {
            forAll(Gen.choose(4,5), { k ->
                val square = squareRoot(k)
                square * square == k
            })
        }

        //Example with a custom generator
        "using a collection picker"{
            val values = listOf("pick", "one", "of", "these")
            forAll(Gen.oneOf(values), { element ->
            // test logic
            values.contains(element)
            })
        }

        //Example with built in helper


    }

}

fun evenInts() = object : Gen<Int> {
    override fun generate(): Int {
        while (true){
            val next = Random.nextInt()
            if (next % 2 == 0){
                return next
            }
        }
    }
}