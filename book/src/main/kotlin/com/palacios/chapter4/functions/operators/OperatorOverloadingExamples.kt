package com.palacios.chapter4.functions.operators

fun main(args: Array<String>) {

    //Basic Operators
    /*
    val m1 = Matrix(1,2,3,4)
    val m2 = Matrix (5,6,7,8)
    val m3 = m1 + m2
    val m4 = m1.plus(m2)
    println(m3)

    */

    // In/Contains
    /*
    val ints = arrayOf(1,2,3)

    val a = 3 in ints
    val b = ints.contains(3)

    val c = 5 !in ints
    val d = ints.contains(5)
    */

    //Get/set

    /*
    val board = ChessBoard()
    board[0,4] = Piece.Queen
    println(board[0,4])
    */

    //Invoke
    /*
    val a = Min(1,5,0)
    println(a)
    val b = Min(1L, 2L)
    println(b)
    */

    //less-than, greater-than, equal-less than, greater-equal than

    //val a = BingoNumber("Key to the door",21)
    //val b = BingoNumber("Jump and Jive",35)
    //println( a < b)
    //println (b > a)

    //Assignment example

    //var counter = Counter(1)
    //counter = counter + 3
    //println(counter.k)
    //counter +=2
    //println(counter.k)

    //var counterM = CounterM(4)
    //counterM +=2
    //println(counterM.k)

    //Function literals

    val printHello = { println("hello")}
    printHello()

    val printMessage = { message: String -> println(message)}
    printMessage("ale")
    printMessage("Culon")


}





