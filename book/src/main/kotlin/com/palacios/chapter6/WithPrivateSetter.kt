package com.palacios.chapter6

class WithPrivateSetter(property: Int) {

    var someProperty: Int = 0
        private set(value){
            field = value
        }

    init {
        someProperty = property
    }

}