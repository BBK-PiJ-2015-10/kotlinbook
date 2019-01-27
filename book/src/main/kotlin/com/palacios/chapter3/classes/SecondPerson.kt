package com.palacios.chapter3.classes

class SecondPerson (firstName: String, lastName: String, howOld: Int?) {

    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName,$lastName"
        this.age = howOld
    }

    fun getName(): String = this.name

    fun getAge(): Int? = this.age;
}