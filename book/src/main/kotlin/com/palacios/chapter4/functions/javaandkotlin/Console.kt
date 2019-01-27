package com.palacios.chapter4.functions.javaandkotlin

import java.io.File
import java.io.IOException

object Console {

    fun clear() {}

    //This will make it a static method when use in java
    @JvmStatic fun unclear(){}

    @JvmName("printMeStrings")
    fun printMe(array: Array<String>) : Unit {}

    //This is to be able to use a different name in Java vs Kotlin
    @JvmName("printMeIntegers")
    fun printMe(array: Array<Int>) : Unit {}

    fun createDirectory(file: File){
        if (file.exists()) throw IOException(" ${file.name} already exists")
        file.createNewFile()
    }

    @Throws(IOException::class)
    fun createDirect(file: File){
        if (file.exists()) throw IOException(" ${file.name} already exists")
        file.createNewFile()
    }


}