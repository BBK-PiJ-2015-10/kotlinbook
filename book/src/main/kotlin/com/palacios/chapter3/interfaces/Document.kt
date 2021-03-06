package com.palacios.chapter3.interfaces

import java.io.InputStream
import java.io.OutputStream

interface Document {

    val version: Long
    val size: Long

    val name:String
        get() ="NoName"

    fun save(input: InputStream)

    fun load(stream: OutputStream)

    fun getDescription(): String {
        return "Document $name has $size byte(-s)"
    }
}