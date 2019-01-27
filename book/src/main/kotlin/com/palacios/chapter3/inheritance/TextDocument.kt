package com.palacios.chapter3.inheritance

import java.io.InputStream

class TextDocument(title: String): IPersistable, Document(title), IPrintable {

    override fun save(stream: InputStream) {
        println("Printing the input stream")
    }

    override fun print() {
        println("Saving the document:$title")
    }
}