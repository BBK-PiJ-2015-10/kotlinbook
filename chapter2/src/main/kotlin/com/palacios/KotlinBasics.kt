package com.palacios

fun main(args: Array<String>) {

    val name = "kotlin"

    var lastname: String
    lastname = "palacios"


    println("Your first name is : ${name} and your last name is : ${lastname}" )

    println(plusOne(5))

    val explicitType: Number = 12.3

    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    val newLong = int.toLong()
    val newDouble = float.toDouble()

    val array = arrayOf(1,2,3)

    val perfectSquares = Array(10, {k -> k * k})

    // line comment

    /*
    Block comment


     */

    val firstName ="Sam"

    val str = "hello $firstName. Your name has ${firstName.length} characters "

    println(str)

    val atoZ = "a".."z"
    val oneToNine = 1..9

    val isTrue = "c" in atoZ
    println(isTrue)
    val isFalse = 11 in oneToNine
    println(isFalse)

    val countingDown = 20.downTo(5)
    val countingUp = 100.rangeTo(400)

    val oneToFifty = 1..50
    val oddNumbers = oneToFifty.step(2)
    val countDownEvenNumbers  = (2..100).step(2).reversed()

    //Loops

    //while (true){
      //  println("This will print forever")
    //}

    val list = listOf(1,2,3,4)
    for (k in list){
        print(k)
    }
    val set = setOf(1,2,3,4)
    for (k in set){
        print(k)
    }

    val oneToTen = 1..10
    for (k in oneToTen){
        for (j in 1..5){
            println(k * j)
        }

    }

    val otherString = "print my characters"
    for (char in otherString){
        println(char)
    }




}

fun plusOne(x: Int) = x + 1