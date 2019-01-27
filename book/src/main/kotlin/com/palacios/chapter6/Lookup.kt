package com.palacios.chapter6

import java.lang.RuntimeException

class Lookup {

    private var _keywords: HashSet<String>? = null

    val keywords: Iterable<String>
    get() {
        if (_keywords == null){
            _keywords = HashSet<String>()
        }
        return _keywords ?: throw RuntimeException("Invalid keywords")
    }

}