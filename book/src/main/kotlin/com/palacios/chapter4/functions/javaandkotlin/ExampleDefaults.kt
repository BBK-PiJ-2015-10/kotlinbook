package com.palacios.chapter4.functions.javaandkotlin

class ExampleDefaults {

    //This creates method overloading when using this function in a Java class
    @JvmOverloads
    fun join(array: Array<String>, prefix: String = "", separator: String = "", suffix : String = ""){

    }

}