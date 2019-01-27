package com.palacios.chapter3.override.samefuncname

import java.io.OutputStream

interface VendorImage {

    fun save(output: OutputStream) {
        println("Vendor image doing something")
    }

}