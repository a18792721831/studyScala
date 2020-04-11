package com.study.mytree

object Test {

  def main(args: Array[String]): Unit = {
    val v: MyTree = MyNode(
      MyNode(
        MyNode(MyLeaf(4), MyLeaf(0)),
        MyLeaf(3)),
      MyNode(MyLeaf(56), MyLeaf(98)))
    println(sum(v))
  }

  def sum(x: MyTree):Int = {
    x match {
      case MyLeaf(v) => v
      case MyNode(z,y) => sum(z) + sum(y)
    }
  }

}
