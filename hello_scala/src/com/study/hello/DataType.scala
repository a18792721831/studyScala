package com.study.hello

object DataType {

  def main(args: Array[String]): Unit = {

    val list = List('a,'b,'c,'d)
    println(list)

    val map = Map('a->"a",'b->"b",'c->"c")
    println(map)
    println(map + ('a->"aa"))
    println(map + ('b -> "bb"))
    println(map)

    var map1 = Map('a->"a",'b->"b",'c->"c")
    println(map1)
    map1 += ('e -> "e")
    println(map1)
    map1 += ('a->"aaaa")
    println(map1)
    println('a)
  }


}
