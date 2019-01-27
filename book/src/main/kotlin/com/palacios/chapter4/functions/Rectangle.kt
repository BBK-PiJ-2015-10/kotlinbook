package com.palacios.chapter4.functions

class Rectangle {

    fun printArea(width: Int, height: Int): Unit {
        val area = calculateArea(width,height)
        println("This is the area : $area")
    }

    fun calculateArea(width: Int, height: Int) = width * height

    //Example of an inner function
    fun printArea2(width: Int, height: Int): Unit {
        fun calculateArea2() = width * height
        val area = calculateArea2()
        println("This is the area : $area")
    }
}