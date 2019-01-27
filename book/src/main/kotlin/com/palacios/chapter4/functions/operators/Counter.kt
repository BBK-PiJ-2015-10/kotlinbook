package com.palacios.chapter4.functions.operators

class Counter (val k: Int) {

    operator fun plus(j: Int) = Counter(k + j)

}