package com.palacios

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.util.*

fun main(args: Array<String>) {

    /*

    val file = File("/etc/nginx/nginx.conf")
    val a = File("/mobydic.doc")
    val b = File("/mobydick.doc")
    val sameRef = a ===b
    println(sameRef)

    val date = Date()
    val test = if (date.year == 2016) true else false
    println(test)

    fun isZero(x: Int): Boolean {
        return if (x==0) true else false
    }

    val success = try {
        true
    } catch(e: IOException){
        false
    }

    var testor : String? = null

    */

    val test = "ale"
    println(explicitCasting(test));

}


fun isString(any: Any): Boolean {
    return if (any is String) true else false
}

fun printIfStrin(any: Any){
    if (any is String){
        println(any.length)
    }
}

fun explicitCasting(any: Any): Int {
    val string : String? = any as String
    if (string != null) {
        return string.length
    }
    return 1
}

fun readFile(path: Path): Unit {
    val input = Files.newInputStream(path)
    try {
        var byte = input.read()
        while (byte != -1){
            println(byte)
            byte = input.read()
        }
    } catch (e: IOException){
        println("Error reading from file. Error was {e.message}")
    } finally {
        input.close()
    }
}