package com.palacios.chapter3.inheritance

import java.math.BigDecimal

class ChequePayment : Payment {

    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount){
        this.name = name
        this.bankId = bankId
    }

    var name: String
        get() = this.name

    var bankId: String
        get() = this.bankId


}