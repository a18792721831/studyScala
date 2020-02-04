package com.study

object Testsss {

  def main(args: Array[String]): Unit = {

    //int
    var a: Int = 8
    a = 7
    a = 8
    //double
    var b: Double = 3.4
    //long
    var c: Long = 88888
    //java.lang.String
    var d: String = "hello"
    //boolean
    var e: Boolean = true
    //float
    var f: Float = 3.14f
    //元组
    var (g: String, h: Boolean) = ("test", true)
    //数组？
    var i: Array[String] = new Array[String](3)
    i(0) = "hi "
    i(1) = " ,  "
    i(2) = "  ....  "
    for (x <- 0 to i.length - 1) print(i(x))
    //    i.foreach(x => println(i(x)))
    println()
    var j = Array("hello ", "xiao ", "hua ")
    for (x <- 0 to j.length - 1)
      print(j(x))
    println()
    //二维数组
    var k = new Array[Array[String]](3)
    for (x <- 0 to k.length - 1) {
      var t = new Array[String](3)
      for (y <- 0 to t.length - 1) {
        t(y) = y + " "
      }
      k(x) = t
    }
    for (x <- 0 to k.length - 1) {
      var t: Array[String] = k(x)
      for (y <- 0 to t.length - 1) {
        print(t(y))
      }
      println()
    }
  }

}
