package com.palacios.chapter5.projections

sealed class Projection<T>{
    abstract fun <U> map(fn: (T)-> U): Projection<U>
    abstract fun getOrElse(or: () -> T): T
    abstract fun filter(fn: (T) -> Boolean): Projection<T>
    abstract fun toList(): List<T>
    abstract fun orNull(): T?
    abstract fun exists(fn: (T) -> Boolean): Boolean
}

fun <T> Projection<T>.getOrElse(or: () -> T): T =
    when (this) {
        is EmptyProjection -> or()
        is ValueProjection -> this.value
    }

class ValueProjection<T>(val value : T): Projection<T>(){

    override fun <U> map(fn: (T) -> U): Projection<U> =
        ValueProjection(fn(value))

    override fun getOrElse(or: ()-> T): T = value

    override fun filter(fn: (T) -> Boolean): Projection<T> =
        when (fn(value)) {
            true -> this
            false -> EmptyProjection()
        }

    override fun toList(): List<T> = listOf(value)

    override fun orNull(): T? = value

    override fun exists(fn: (T) -> Boolean): Boolean = fn(value)

}

class EmptyProjection<T>: Projection<T>(){

    override fun<U> map(fn: (T)->U): Projection<U> =
        EmptyProjection<U>()

    override fun getOrElse(or: () -> T): T = or()

    override fun filter(fn: (T) -> Boolean): Projection<T> = this

    override fun toList(): List<T> = emptyList()

    override fun orNull(): T? = null;

    override fun exists(fn: (T) -> Boolean): Boolean = false

}

