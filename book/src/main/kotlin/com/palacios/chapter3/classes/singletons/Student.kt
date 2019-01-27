package com.palacios.chapter3.classes.singletons

class Student private constructor(val name: String) {

    companion object : StudentFactory {
        override fun create(name: String): Student {
            return Student(name)
        }
    }

}