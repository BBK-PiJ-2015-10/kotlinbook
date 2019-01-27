package com.palacios.chapter4.functions.operators

class ChessBoard {

    private val board = Array<Piece>(64,{Piece.Empty})

    operator fun get(rank: Int, file: Int) = board[file*8 + rank]

    operator fun set(rank: Int, file: Int, value: Piece): Unit {
        board[file * 8 + rank] = value
    }
}