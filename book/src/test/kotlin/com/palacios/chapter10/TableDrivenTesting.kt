package com.palacios.chapter10


import io.kotlintest.matchers.shouldBe
import io.kotlintest.properties.forAll
import io.kotlintest.properties.table
import io.kotlintest.properties.headers
import io.kotlintest.properties.row
import io.kotlintest.specs.StringSpec
import java.security.KeyStore

class TableExample : StringSpec() {

    init {

        "example of booleans" {

            val table = table(
                headers("a","b","c"),
                row(true,true,true),
                row(true,true,true),
                row(true,false,false)

            )

            forAll(table){a,b,c ->
                a shouldBe true
                if (b)
                    c shouldBe true
            }
        }
    }

}