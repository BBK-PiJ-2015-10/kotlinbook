package com.palacios.chapter7

import java.util.Optional

fun main(args: Array<String>) {

    val name: String ? = null

    val name2: String ? = "Harry"

    println("This is the beginning")

    val person = Person("ale",null)
    val result = getCountryNameSafe(person)

    println("The result is null ${result.isNullOrEmpty()}")

    //Example to convert a nullable to a non nullable - Force operator!!
    val nullableName : String ? = "george"
    val first: String = nullableName !!

    // I am allowing to assign and unsafe to a safe
    //getCountrySafe(person)!!.name

    //Elvis operator
    val result2 : String = getCountryNameSafe(person) ?: "England"
    println(result2)

    // Safe casting, if not possible leaves it as null
    val location: Any = "London"
    val safeString: String ? = location as? String
    println(safeString)
    val safeInt: Int ? = location as? Int
    println(safeInt)

    // Optional

    val optionalName: Optional<String> = Optional.of("william")

    val empty: Optional<String> = Optional.empty()

    val another: Optional<String> = Optional.ofNullable(null)

    val address  = lookupAddress("WC1 BN").orElse("100 Hunter Street")

    val price = lookupAddress("WC1N 1BL").flatMap(::lookupHousePrice).orElse(0)



}

fun name1() : String ?  {
    return null
}

fun getCountryNameSafe(person: Person?): String ? {
    return person?.address?.city?.country?.name
}

fun getCountrySafe(person: Person?): Country ? {
    return person?.address?.city?.country
}

class Person(name: String, val address: Address?)

class Address(name: String, postCode: String, val city: City?)

class City (name: String, val country: Country?)

class Country(val name: String)

fun lookupAddress(postcode: String): Optional<String> {
    return Optional.empty()
}

fun lookupHousePrice(address: String): Optional<Int> { return Optional.empty()}