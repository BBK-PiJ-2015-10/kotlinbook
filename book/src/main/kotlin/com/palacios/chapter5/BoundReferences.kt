package com.palacios.chapter5

fun main(args: Array<String>) {

    //This is an example unbound reference
    val result1 =listOf("foo","moo","boo").filter{(String::equalsIgnoreCase)("boo",it)}
    println(result1)

    // This is an example of a bound reference
    val result2 = listOf("foo","baz","BAR").filter("bar"::equalsIgnoreCase)

    val mysubstring = fun String.(substr: String): Boolean = this.contains(substr)

    println("hello".mysubstring("he"))

}


fun String.equalsIgnoreCase(other: String) = this.toLowerCase() == other.toLowerCase()

fun foo(fn: String.() -> Boolean): Unit {
    "string".fn()
}