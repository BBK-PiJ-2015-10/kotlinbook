package com.palacios.chapter6.delegatedproperties

// If the class is only read property, then you could have used in Map
//class Player(val map: MutableMap<String,Any>) {
class Player(val map: Map<String,Any>){
    val name: String by map
    val age: Int by map
    val height: Double by map
}