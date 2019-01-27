package com.palacios.chapter3.inheritance

import java.math.BigDecimal
import java.util.Date;

class CardPayment(amount : BigDecimal, val number: String, val expiryDate: Date, val type: CardType) : Payment(amount) {
}