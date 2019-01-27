package com.palacios.chapter3.classes

class Person(val firstName: String, val lastName: String, val age: Int?) {

    init{
        require(firstName.trim().length > 0){
            "Invalid first name argument"
        }
        require(lastName.trim().length > 0) {
            "Invalid last name argument"
        }

        if (age !=null){
            require(age >=0 && age < 150)
        }
    }

    constructor(firstName: String, lastName: String) : this (firstName,lastName,null)

}