package com.palacios.chapter3.override

import com.palacios.chapter3.override.property.BaseB
import com.palacios.chapter3.override.property.DerivedB
import com.palacios.chapter3.override.samefuncname.PNGImage
import java.io.ByteArrayOutputStream

fun main(args: Array<String>) {

    val baseB = BaseB("BaseB::value")
    val derivedB = DerivedB()
    println("DerivedB:${derivedB.propertyFoo}")
    derivedB.propertyFoo = "on the spot value"
    println("BaseB:${baseB.propertyFoo}")
    println("DerivedB:${derivedB.propertyFoo}")

    val pngImage = PNGImage()
    val os = ByteArrayOutputStream()
    pngImage.save(os)



}