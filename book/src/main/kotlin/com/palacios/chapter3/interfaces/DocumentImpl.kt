package com.palacios.chapter3.interfaces

import java.io.InputStream
import java.io.OutputStream

class DocumentImpl : Document {

    override val version: Long
        get() = 0

    override val size: Long
        get() = 0

    override fun save(input: InputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(stream: OutputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}