package com.palacios.chapter4.functions.javaandkotlin

import java.io.File
import java.util.concurrent.Executors

fun main(args: Array<String>) {

    //Example of accessing a JavaBean

    /*
    val me = Named()
    me.name = "ale"
    println(me.name)
    */


    //Examples of leveraging Java SAM
    /*
    val threadPoo1a = Executors.newFixedThreadPool(4)
    threadPoo1a.submit {
        println("This is almost the end of the year")
    }

    val threadPoolb = Executors.newFixedThreadPool(4)
    threadPoolb.submit(object : Runnable {
        override fun run(){
            println("This is the old school way of doing it")
        }
    })


    val threadPoolc = Executors.newFixedThreadPool(4)
    threadPoolc.submit(Runnable { println("Giving this guy a hint")})
    */


    //Example of using of reserve words in Kotlin but not in Java
    /*
    val target = MyDate()
    target.`when`("2016")
    println(target.createNewFile())
    */

   Console.printMe(arrayOf("ale","palacios"))

   val file = File("ale")
   Console.createDirect(file)

}

