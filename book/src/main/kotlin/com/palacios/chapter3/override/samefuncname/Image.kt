package com.palacios.chapter3.override.samefuncname

import java.io.OutputStream

open class Image {

    open fun save(output: OutputStream) {
        println("Some logic to save an image")
    }

}