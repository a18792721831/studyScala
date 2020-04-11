package com.study.条件表达式

object Main {

  /**
    * 每个条件表达式必须有值
    * if (x > 0) 1 else -1
    * 其返回值是Int
    *
    * if (x > 0) "sss" else 1
    * 其返回值是Any
    *
    * if (x > 0) 6
    * 等价于
    * if (x > 0) 6 else ()
    * 其返回值是Unit
    * Unit 就是 ()
    * 类似java中的void
    */
  def main(args: Array[String]): Unit = {
    val x = 6
    val s = if (x > 0) 1 else -1
    println(s)

    val y = -6
    var r = 0
    if (y > 0) r = 1 else r = -1
    println(r)

    val ss: Any = if (x > 0) "sss" else 1
    println(ss.getClass)

    val yyy: Unit = if (x < 0) "ssss"
    println(yyy)

    val ppp: Unit = if (x < 0) "ssss" else ()
    println(ppp)


  }

}
