package com.study

object TestVal {

  def main(args: Array[String]): Unit = {
    val hello = "hello"
    println(hello)
    val (x, y, z) = (1, 2, 3)
    println(x, y, z)
    println(add(9))
    println(four)
    println(add2(2, 3))
    println(add3(2))

    val f = (x: Int) => x + 1
    println(f)
    println(f(1))

    val f1 = (x: Int, y: Int) => x * y
    println(f1)
    println(f1(2, 3))

    val pa = add2(6, _: Int)
    println(pa)
    println(pa(3))

    val pa1 = f1(4, _: Int)
    println(pa1)
    println(pa1(5))

    val k = mul(6) _
    println(mul(3)(9))
    println(k(7))

    println(sum(1, 2, 3, 4, 5))
    println(sum(2, 3, 4, 5, 6, 7, 8, 9, 0, 22))
  }

  def sum(x: Int*): Int = {
    var s: Int = 0
    x.map { y =>
      s += y
    }
    return s
  }

  def mul(x: Int)(y: Int): Int = x * y

  def add3(m: Int): Int = add2(3, m)

  def add2(m: Int, n: Int): Int = m + n

  def add(m: Int): Int = m + 1

  def four: Int = 4
}
