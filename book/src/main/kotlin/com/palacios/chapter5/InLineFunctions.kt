package com.palacios.chapter5

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {



}


inline fun <T : AutoCloseable, U> withResource(resource: T, fn: (T) -> U): U {
    try {
        return fn(resource)
    } finally {
        resource.close()
    }
}


fun characterCount(filename : String): Int {
    val input = Files.newInputStream(Paths.get(filename))
    return withResource(input){input.buffered().reader().readText().length}
}