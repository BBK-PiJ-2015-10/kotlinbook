package com.palacios.chapter6

interface Shape {
    val Area: Double
        get;
}

class Rectangle(val width: Double, val height: Double) : Shape {
    override val Area: Double
        get() = width * height

    val isSquare : Boolean
        get() = width == height

}