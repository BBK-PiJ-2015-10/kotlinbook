package com.palacios.chapter5.customdsl

import java.lang.RuntimeException

interface Matcher<T> {

    fun test(lhs: T): Unit

    infix fun or(other: Matcher<T>): Matcher<T> = object : Matcher<T>{
        override fun test(lhs: T ){
            try {
                this@Matcher.test(lhs)
            } catch(e: RuntimeException){
                other.test(lhs)
            }
        }
    }

}