package com.study.hello

object hello_dict {

  def main(args: Array[String]) = {

    var (first, second, third, four) = ("first", "second", "third", "four")

    var info = (first, second, third, four)

    println(info._1)
    println(info._2)
    println(info._3)
    println(info._4)

    println(
      """hello,scala,
        |
        |huoche
        no
      """.stripMargin)


  }

}
