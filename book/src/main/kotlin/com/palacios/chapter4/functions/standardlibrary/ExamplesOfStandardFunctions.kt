package com.palacios.chapter4.functions.standardlibrary

import java.awt.BasicStroke
import java.awt.Color
import java.awt.Graphics2D
import java.awt.RenderingHints
import java.nio.file.Paths;

fun main(args: Array<String>) {

    //This is an example of apply

    /*
    val task1 = Runnable { println("Running first approach") }
    val thread1 = Thread(task1)
    thread1.setDaemon(false)
    thread1.start()

    val task2 = Runnable {println("Running second approach")}
    Thread(task2).apply { setDaemon(false) }.start()

    */

    //This is an example of let

    /*
    val outputPath = Paths.get("C:/Users/yasse/OneDrive/Documents/PK").let{
        val path = it.resolve("output")
        path.toFile().createNewFile()
        path
    }
    */

    // This is an example of with
    /*
    val g2: Graphics2D
    with(g2){
        stroke = BasicStroke(10F)
        setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON)
        setRenderingHint(RenderingHints.KEY_DITHERING,RenderingHints.VALUE_DITHER_ENABLE)
        background = Color.BLACK
    }
    */

    //Example of closure

    /*
    val program = Program()
    var outcome = 0
    program.operateTwoNumbers(2,7){x,y-> outcome = x + y}
    println(outcome)
    */

    //Example of require, assert, check
    neverEmpty("")

}

fun neverEmpty(str: String){
    require((str.length > 5),{ "String can not be less than 5 letters"})
    println(str)
}

class Program {

    fun operateTwoNumbers(a: Int, b: Int, action: (Int,Int)-> Unit) {
        action(a,b)

    }

}


