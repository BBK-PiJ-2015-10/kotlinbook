package com.palacios.chapter3.composition

import com.palacios.chapter3.composition.Panel
import com.palacios.chapter3.composition.Rectangle

fun main(args: Array<String>) {

    val panel = Panel(Rectangle(10, 100, 30, 100))
    println("Panel height : " +panel.getHeight())
    println("Panel width : " + panel.getWidth())

}