package com.palacios.chapter6

class Student(name: String, age: Int) {

    public var Name = ""
    set(value){
        field = value
    }

    public var Age = 20
    set(value){
        field = value
    }

    init{
        Name = name
        Age = age
    }

}