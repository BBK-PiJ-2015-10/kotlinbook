package com.palacios.chapter3.composition

class Rectangle (val x1: Int, val x2: Int, val y1:Int, val y2:Int): UIElement {
    override fun getHeight(): Int {
        return y2-y1
    }
    override fun getWidth(): Int {
        return x2-x1
    }
}