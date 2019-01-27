package com.palacios.chapter5.projections

sealed class Either<L,R> {

    fun <T> fold(lfn: (L) ->T , rfn: (R)-> T) : T = when (this){
        is Left -> lfn(this.value)
        is Right -> rfn(this.value)
    }

    fun leftProjection(): Projection<L> = when (this){
        is Left -> ValueProjection(this.value)
        is Right -> EmptyProjection<L>()
    }

    fun rightProjection(): Projection<R> = when (this){
        is Left -> EmptyProjection<R>()
        is Right -> ValueProjection(this.value)
    }

}

class Left<L>(val value: L) : Either<L, Nothing>()
class Right<R>(val value: R) : Either<Nothing, R>()

