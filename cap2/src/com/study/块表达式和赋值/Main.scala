package com.study.块表达式和赋值

object Main {

  /**
    * {}块包含一系列的表达式，其返回结果也是表达式，返回最后一个表达式
    * 所以可以使用{}进行赋值操作
    *
    * 赋值操作的返回结果是()
    * 所以不能连续赋值
    * 不能将赋值语句放在{}最后
    *
    */
  def main(args: Array[String]): Unit = {

    val test = {
      val v1 = 1
      val v2 = 2
      v1 + v2
    }
    println(test)

    val test1 = {
      var v = 1
      v += 1
    }
    println(test1)

    val test2 = {
      var x = ()
      var y = ()
      x = y = 2
    }
    println(test2)
  }

}
