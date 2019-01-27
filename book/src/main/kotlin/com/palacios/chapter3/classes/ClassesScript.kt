package com.palacios.chapter3.classes

import com.palacios.chapter3.classes.enums.Planet
import com.palacios.chapter3.classes.enums.Word
import com.palacios.chapter3.classes.singletons.Student

fun main(args: Array<String>) {

    /*

    val firstPerson = Person("ale","palacios",25)

    firstPerson.age
    firstPerson.firstName
    firstPerson.lastName

    val secondPerson = SecondPerson("ale","palacios",25)
    secondPerson.getAge()
    secondPerson.getName()

    val simplePerson = SimplePerson("ale",null,null)
    println(simplePerson.age)
    println(simplePerson.firstName.length)
    println(simplePerson.lastName?.length)

    */

    //Enums example

    /*
    val planet = Planet.MARS;

    planet.name
    planet.ordinal

    val planet2 = Planet.valueOf("MARS")

    val planets = Planet.values()

    val w = Word.HELLO
    w.print()

    */

    //Singleton example

    val student = Student.create("Ale Cane")



}