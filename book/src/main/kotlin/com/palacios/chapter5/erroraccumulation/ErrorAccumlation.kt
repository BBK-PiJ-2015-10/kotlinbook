package com.palacios.chapter5.erroraccumulation

import java.lang.RuntimeException

sealed class Validation {

    abstract infix operator fun plus(other: Validation): Validation

    abstract fun<T> getOrElse(t: T, or: (List<String>) -> T): T
}

object Valid: Validation() {

    override fun plus(other: Validation): Validation = when (other){
        is Invalid -> other
        is Valid -> this
    }

    override fun <T> getOrElse(t: T, or: (List<String>) -> T): T = t
}

class Invalid(val errors: List<String>): Validation(){
    companion object {
        operator fun invoke(error: String) = Invalid(listOf(error))

    }

    override fun plus(other: Validation): Validation = when (other){
        is Invalid -> Invalid(this.errors + other.errors)
        is Valid -> this
    }

    override fun <T> getOrElse(t: T, or: (List<String>) -> T): T = or(errors)

}

class Student(val name: String, val studentNumber: String, val email: String)

fun isValidName(name: String): Validation = when (name.trim().length > 2) {
    true -> Valid
    else -> Invalid("Name $name is too short")
}

fun isValidStudentNumber(studentNumber: String): Validation = when (studentNumber.all{Character.isDigit(it)}){
    true -> Valid
    else -> Invalid("Student number be only digits: $studentNumber")
}

fun isValidEmailAddress(email: String): Validation = when (email.contains("@")) {
    true -> Valid
    else -> Invalid("Email must contain an '@' symbol")
}

fun main(args: Array<String>) {

    val student = Student("alexander","1234","yasserpo@hotmail.com")

    val validation = isValidName(student.name) + isValidEmailAddress(student.email) + isValidStudentNumber(student.studentNumber)

    validation.getOrElse(student,{throw RuntimeException("Error creating student. The errors are $it")})
    
}
