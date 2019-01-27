package com.palacios.chapter6.delegatedproperties

class Record(id: String) : WithId by Record.indentifier(id) {
    companion object Record {
        fun indentifier(identifier: String) = WithIdImpl(identifier)
    }
}