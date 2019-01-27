package com.palacios

fun main(args: Array<String>) {

    println("Hello, World")
    val task = Task(1,"Mixing Java and Kotlin Code","A Palacios")
    println("Task:${task.title}")

    val student = Student("Jenny Hot")
    println("Student:${student.name}")

    val carManufacturer = CarManufacturer("Benz")
    println("CarManufacturer:${carManufacturer.name}")

    println("This is the end")

}

