package com.palacios.chapter3.sealed

sealed class IntBinaryTree {

    class EmptyNode: IntBinaryTree()

    class IntBinaryTreeNode(val left: IntBinaryTree, val value: Int, val right: IntBinaryTree) : IntBinaryTree()

}