package com.palacios.chapter4.functions

import com.palacios.chapter4.functions.operators.Matrix

fun main(args: Array<String>) {

    //println(square(5))

    //println(concat1("alejandro","palacios"))

    //val string = "hello"
    //val length = string.take(5)

    //val rectangle = Rectangle();
    //rectangle.calculateArea(1,3)

    //println(rectangle.printArea2(1,3))

    //fizzbuzz(1,2)

    // I can pass the arguments as I wish using named parameters
    //divide(roundingMode = RoundingMode.CEILING, divisor = BigDecimal(20))

    //val list =  listOf(1,2,3,4,5)
    //println(list.dropper(2))


    //val selenium = Element("selenium")
    //selenium.react(Particle())
    //selenium.react(Electron())
    ///val neon = NobleGas("neon")
    //neon.react(Particle())
    //neon.react(Electron())

    //val (pos, neg) = roots(4)
    //println(pos)
    //println(neg)

    //example of infix
    //val account = Account()
    //account add 5.0
    //println(account.balance)

    //example of operator
    val m1 = Matrix(1, 2, 3, 4)
    val m2 = Matrix(5, 6, 7, 8)
    val m3 = m1 + m2
    val m4 = m1.plus(m2)
    println(m3)

    val ints = arrayOf(1,2,3)

    val a = 3 in ints
    val b = ints.contains(3)

    val c = 5 !in ints
    val d = ints.contains(5)

}



fun square(k: Int) = k *k

fun concat1(a: String, b: String) = a + b

fun roots(k: Int): Pair<Double,Double>{
    require(k > 0)
    val root = Math.sqrt(k.toDouble())
    return Pair(root,-root)
}


