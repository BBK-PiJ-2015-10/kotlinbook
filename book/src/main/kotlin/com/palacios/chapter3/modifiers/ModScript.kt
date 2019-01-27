package com.palacios.chapter3.modifiers

import java.lang.reflect.Modifier

fun main(args: Array<String>) {

    val derivedContainer = DerivedContainer()

    println("Derived Container fieldA is: ${derivedContainer.fieldA}")

    val container : Container = DerivedContainer()

    derivedContainer.javaClass.superclass.getDeclaredFields().forEach { field ->
        field.setAccessible(true)
        println("Field:${field.name},${Modifier.toString(field.modifiers)},Value=${field.get(derivedContainer)}")
    }

    derivedContainer.javaClass.getDeclaredFields().forEach{
        field ->
        field.setAccessible(true)
        println("Field:${field.name},${Modifier.toString(field.modifiers)}, Value=${field.get(derivedContainer)} ")
    }


}