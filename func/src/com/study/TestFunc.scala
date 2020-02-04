package com.study

object TestFunc {

  def main(args: Array[String]): Unit = {

  }

  //无参数、无返回值的函数
  def sayHello(): Unit = println("hello")

  //一个参数、无返回值
  def sayRe(str: String): Unit = println(str)

  //一个参数、一个返回值
  def Repeat(str: String): String = return str+str

}
