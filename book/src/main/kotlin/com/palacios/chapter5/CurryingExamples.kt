package com.palacios.chapter5

import java.lang.Appendable
import java.util.logging.Level

fun main(args: Array<String>) {

    val logger3 = ::logger.curried()
    val logger2 = logger3(Level.SEVERE)
    val logger1 = logger2(System.out)
    logger1("myMessage")

    val log = ::logger.curried()(Level.SEVERE)(System.out)("myMessage")
}

fun logger(level: Level, appender: Appendable, msg: String): Nothing = TODO()

fun <P1,P2,R> Function2<P1,P2,R>.curried(): (P1) -> (P2) -> R = { p1 -> { p2 -> this(p1,p2) } }

fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried(): (P1) -> (P2) -> (P3) -> R =
    {p1 -> { p2-> { p3 -> this(p1,p2,p3)} }}



