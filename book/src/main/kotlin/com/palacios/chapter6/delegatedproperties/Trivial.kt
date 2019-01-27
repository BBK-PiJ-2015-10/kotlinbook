package com.palacios.chapter6.delegatedproperties

class Trivial {
    val flag: Int by TrivialProperty(999)
}