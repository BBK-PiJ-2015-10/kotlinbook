package com.palacios.chapter10

import io.kotlintest.specs.StringSpec

import io.kotlintest.matchers.endWith
import io.kotlintest.matchers.should
import io.kotlintest.matchers.startWith

//These are the inspectors
import io.kotlintest.forAll
import io.kotlintest.forAtLeastOne
import io.kotlintest.forOne
import io.kotlintest.forSome

class InspectorTests: StringSpec(){

    val kings = listOf("Stephen I","Henry I","Henry II","Henry III","William I","William III")

    // forAll is the inspector
    init {
        "all kings should have a regal name"{
            forAll(kings){
                it should endWith("I")
            }
        }
    }

    // forOne
    init {
        "only one king has the name Stephen"{
            forOne(kings){
                it should startWith("Stephen")
            }
        }
    }

    // pass between 1 and n-1
    init {
        "some kings have a regal number II"{
            forSome(kings){
                it should endWith("II")
            }
        }
    }

    // pass between 1 and n
    init {
        "at least one King has the name Henry"{
            forAtLeastOne(kings){
                it should startWith("Henry")
            }
        }
    }

}