package com.palacios.chapter3.sealed

fun main(args: Array<String>) {

    val tree = IntBinaryTree.IntBinaryTreeNode(
        IntBinaryTree.IntBinaryTreeNode(
            IntBinaryTree.EmptyNode(),
            1,
            IntBinaryTree.EmptyNode()
        ), 10, IntBinaryTree.EmptyNode()
    )

    println(toCollection(tree));


}


// pattern matching example
fun toCollection(tree: IntBinaryTree): Collection<Int> =
    when (tree) {
        is IntBinaryTree.EmptyNode -> emptyList<Int>()
        is IntBinaryTree.IntBinaryTreeNode -> toCollection(tree.left) + tree.value + toCollection(
            tree.right
        )
    }
