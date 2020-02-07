package com.study

class MyFucT extends Function1[Int, Int] {
  override def apply(v1: Int): Int = v1 + 1
}

class AddTwo extends (Int => Int) {
  override def apply(v1: Int): Int = {
    println("add 2")
    v1 + 2
  }
}

object MyFucT {

  def apply() = new MyFucT

  def main(args: Array[String]): Unit = {
    println(MyFucT()(2))
    println(new AddTwo()(4))
  }

}

object Test{
  def test(x: => String) = println(x)
  def getStr = "ss "
  def main(args: Array[String]): Unit = {
    test(getStr)
  }
}