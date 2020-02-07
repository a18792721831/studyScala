package com.study

object MyTestApply {

  def main(args: Array[String]): Unit = {
    val myApply = new MyApply
    println(myApply)
    myApply()
    myApply.apply1
    myApply.apply2
    myApply.apply2()
  }

}
