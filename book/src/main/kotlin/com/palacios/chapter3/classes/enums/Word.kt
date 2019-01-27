package com.palacios.chapter3.classes.enums

public enum class Word : Printable {

    HELLO {
        override fun print() {
            println("Word is hello")
        }
    },

    BYE {
        override fun print(){
            println("Word is good bye")
        }
    }
}