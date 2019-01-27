package com.palacios.chapter5

import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

fun main(args: Array<String>) {

    //Example of closures

    //A closure is a function that has access to variables and parameters defined in outer scopes.
    /*

    val counter = AtomicInteger(0)
    val cores = Runtime.getRuntime().availableProcessors()
    val threadPool = Executors.newFixedThreadPool(cores)

    threadPool.submit {
        println("I am task number ${counter.incrementAndGet()} ")
    }

    var containsNegative = false

    val ints = listOf(1, 2, 3, 4, 5,-7)
    ints.forEach { if (it < 0) containsNegative = true }

    println(containsNegative)

    */

    //Examples of Anonymous functions

    /*
    listOf(1,2,3).filter{ it > 1 }

    val ints =  listOf(1,2,3)
    val evens = ints.filter(fun(k:Int) = k %2 ==0)
    println(evens)
    val even2 = ints.filter(fun(k) = k %2 ==0)

    */
    //Top-level, member, and extension functions references

    val ints = listOf(1,2,3,4,5)
    val evens = ints.filter{ isEven(it)}
    val evens2 = ints.filter(::isEven)
    val odds = ints.filter{it.isOdd()}
    val odds2 = ints.filter(Int::isOdd)

    val result1= foo(2.0,5.0, {a,b->Math.pow(a,b)})
    println(result1)

    val result2 = foo(2.4,4.1,Math::pow)

}

class Student(val fistName: String, val lastName: String){

    fun loadStudents() : List<Student> = listOf(Student("alejandro","palacios"),Student("alexis","baltimora"))

    fun students(nameToMatch: String): List<Student> {
        return loadStudents().filter { it.lastName == nameToMatch}
    }


}

fun isEven(k: Int) : Boolean = k % 2 ==0

fun Int.isOdd(): Boolean = this % 1 ==0

fun foo(a: Double, b: Double, f: (Double, Double)->Double) = f(a,b)
