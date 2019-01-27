package com.palacios.chapter3.classes.singletons

object Singleton {

    private var count =0

    fun doSomething(): Unit {
        println("Calling a doSomething {$(++count)} calls/-s in total")
    }
}