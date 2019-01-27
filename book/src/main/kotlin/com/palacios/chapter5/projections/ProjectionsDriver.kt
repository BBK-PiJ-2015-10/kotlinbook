package com.palacios.chapter5.projections



class User(val name: String, val admin: Boolean)
object ServiceAccount
class Address(val town: String, val postcode: String)

fun getCurrentUser(): Either<ServiceAccount, User> = TODO()

fun getUserAddress(user: User): List<Address> = TODO()


fun main(args: Array<String>) {

    val addresses = getCurrentUser().fold({ emptyList<Address>()},{ getUserAddress(it)})

    val postcode = getCurrentUser().rightProjection().map{ getUserAddress(it)}.map{addresses.map{it.postcode}}

    val isAdmin = getCurrentUser().rightProjection().exists { it.admin }

}