package com.palacios.chapter3.override.samefuncname

import java.io.OutputStream

class PNGImage : Image(), VendorImage {

    override fun save(output: OutputStream){
        super<VendorImage>.save(output)
        super<Image>.save(output)
        println("I placed a call to both")
    }

}