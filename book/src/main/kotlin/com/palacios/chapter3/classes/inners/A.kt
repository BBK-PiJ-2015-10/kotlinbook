package com.palacios.chapter3.classes.inners

class A {

    private val someField: Int = 1

    inner class B {

        private val somefield: Int = 22

        fun foo(s: String) {
            println("Field <somefield> from B" +this.somefield)
            println("Field <somefield> from B" +this@B.somefield)
            println("Field <somefield> from C "+this@A.someField )

        }
    }

}