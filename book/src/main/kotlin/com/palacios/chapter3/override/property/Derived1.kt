package com.palacios.chapter3.override.property

import com.palacios.chapter3.override.property.Base

class Derived1 : Base() {

    override val property1: String
        get() = "Derived::value"

}