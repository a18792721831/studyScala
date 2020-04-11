package com.study.语句终止

object Main {

  /**
    * 因为scala支持不写分号结尾，所以，一定要保证语句终止正确
    *
    * 比如用操作符表示
    * 用花括弧表示
    *
    * 3+12+3+
    * 4
    * 不能写为
    * 3+12+3
    * +4
    */
  def main(args: Array[String]): Unit = {

    val value1 = 3 + 2 + 4 +
    8
    val value2 = if ( 3 > 2) 7+7+
    9 else 8+
    7
    val value3 = if (3 > 4) {
      3+1+12+
      44
      +22
    } else {
      4+2+
      2
    }
    println(value1)
    println(value2)
    println(value3)

  }

}
