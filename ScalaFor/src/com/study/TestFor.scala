package com.study

object TestFor {

  def main(args: Array[String]): Unit = {
    //1.普通for循环
    for (i <- 1 to 6) {
      println(s"i=$i")
    }
    //2.for循环的另一种写法 1-5
    for (i <- Range(1,6)){
      println(s"i=$i")
    }
    //2等价于
    for (i <- 1 until 6){
      println(s"i=$i")
    }
    //3.for守卫
    for (i <- 1 to 6 if i % 2 == 0){
      println(s"i=$i")
    }
    //等价于
    for (i <- 1 to 6) {
      if (i%2 == 0){
        println(s"i=$i")
      }
    }
    //4.嵌套for
    for (i <- 1 to 6 ; j <- 1 to 3){
      println(s"i=$i,j=$j")
    }
    //5.for返回值
    println(for (i <- 1 to 6 if i % 3 ==0) yield i)
    //6.花括弧
    for { i <- 1 to 4
    j <- 2 to 5}{
      println(s"i=$i,j=$j")
    }
    //7.switch
    val x = 10
    x match {
      case i if i > 0 => println(s"i > 0 i = $i")
      case i if i > 10 => println(s"i > 10 i = $i")
      case i if i == 10 => println(s"i = 10 i = $i")
    }
  }

}
