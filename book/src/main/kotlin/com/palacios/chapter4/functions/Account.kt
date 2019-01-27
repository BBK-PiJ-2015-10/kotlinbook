package com.palacios.chapter4.functions

class Account {

    var balance = 0.0

    infix fun add(amount: Double) {
        this.balance = balance + amount
    }

}