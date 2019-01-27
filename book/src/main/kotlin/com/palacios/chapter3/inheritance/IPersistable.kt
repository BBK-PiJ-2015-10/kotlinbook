package com.palacios.chapter3.inheritance

import java.io.InputStream

interface IPersistable {

    fun save(stream: InputStream)
}