package com.palacios.chapter5.customdsl

import java.lang.RuntimeException

class CollectionMatchers<T>(val collection: Collection<T>) {

    fun contain(rhs: T): Unit { if (!collection.contains(rhs)){throw RuntimeException("Collection does not contain $rhs")} }

    fun notContain(rhs: T): Unit {if(collection.contains(rhs)){throw RuntimeException("Collection should not contain $rhs")}}

    fun haveSizeLessThan(size: Int): Unit {
        if (collection.size >= size){
            throw RuntimeException("Collection should have size less than $size")
        }
    }



}