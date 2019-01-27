package com.palacios.chapter7.annotations

fun main(args: Array<String>) {

    HasStaticFuncs.foo()

    val desc  = MyExecutor::class.annotations.first() as Description
    val summary = desc.summary
    println(summary)
}


@JvmName("filterStrings")
fun filter(list: List<String>): Unit {}

@JvmName("filterInts")
fun filter(list: List<Int>): Unit {}

