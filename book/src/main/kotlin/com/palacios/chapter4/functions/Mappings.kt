package com.palacios.chapter4.functions

class Mappings {

    private val map = hashMapOf<Int,String>()

    private fun String.stringAdd(): Unit {
        map.put(hashCode(),this)
    }

    fun add(str: String) = str.stringAdd()

    private fun String.stringAdd2(): Unit {
        map.put(this@Mappings.hashCode(),this)
    }
}