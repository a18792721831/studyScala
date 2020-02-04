package com.study

object TestVar {

  def main(args: Array[String]): Unit = {
    //var 是变量
    //var 声明可以隐藏数据类型，因为var 类型的变量声明时必须初始化
    var hello = "hello"
    println(hello)
    hello = "hello,world"
    println(hello)
    //var 声明必须初始化
    var tt: Int = 2
    println(tt)
    tt = 3
    println(tt)
    //var 声明时，必须不初始化，可以用_代替默认值，但是编译不通过(在idea中测试)
//    var test = _
//    println(test)
    var (a, b, c) = (1, 2, 3)
    println(a)
    println(b)
    println(c)
    println((a, b, c))
    var x: Int = 2 + 3
    println(x)
    //可变参数一般最多22个参数
//        var (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z)
//        = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26)
//        println((a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z))

  }


}
