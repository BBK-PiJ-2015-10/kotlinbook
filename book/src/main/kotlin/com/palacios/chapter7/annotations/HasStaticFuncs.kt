package com.palacios.chapter7.annotations


object HasStaticFuncs {

    @JvmStatic
    fun foo() : String { return "boo"}

    @JvmOverloads
    fun steteroids(name : String = "Harry", location: String = "Cardiff") : Unit {}

}