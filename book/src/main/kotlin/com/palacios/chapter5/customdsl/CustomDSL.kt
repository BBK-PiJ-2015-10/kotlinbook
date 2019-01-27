package com.palacios.chapter5.customdsl

fun main(args: Array<String>) {

    "ale" equals "palacios"

}

infix fun Any.equals(other: Any): Unit {
    if (this != other){ throw RuntimeException("$this was not equal to $other") }
}

infix fun Any.shouldEqual(other: Any): Unit {
    if (this != other) { throw java.lang.RuntimeException("$this does not equal $other")}
}

infix fun <E> Collection<E>.shouldContain(element: E): Unit {
    if (!this.contains(element)){
        throw java.lang.RuntimeException("Collection does not contain element $element")
    }
}

infix fun <T> Collection<T>.should(fn: CollectionMatchers<T>.() -> Unit) {
    val matchers = CollectionMatchers(this)
    matchers.fn()
}






