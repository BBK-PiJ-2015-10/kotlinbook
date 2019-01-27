package com.palacios.chapter4.functions.operators

object Min {

    operator fun invoke(a: Int, b: Int) =  if (a <= b) a else b

    operator fun invoke(a: Int, b: Int, c: Int) = invoke(invoke(a,b),c)

    operator fun invoke(a: Long, b: Long) = if (a <= b) a else b
}