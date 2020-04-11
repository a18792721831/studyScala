package com.study.循环
import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break
object Main {

  /**
    * while循环
    * for循环：
    * 多生成器for循环
    * 多生成器多守卫for循环
    *
    * 循环控制：
    * break
    * 守卫
    * return(return 之后的语句不会执行)
    *
    * for推导
    * for + yield 实现for 推导
    *
    * for {}
    * 可以使用{}将for里面的多个生成器，守卫写成多行
    */
  def main(args: Array[String]): Unit = {
    var next = 1
    while(next <= 100){
      print(s"$next\t${if (next%10 == 0) "\n" else ""}")
      next += 1
    }

    for (i <- 1 to 10;j <- 1 to 10){
      print(s"${ if (i >= j) s"$j*$i=${i*j}\t${if (j==i) "\n" else ""}" else ""}")
    }

    for (i <- 1 to 10;j <- 1 to 10 if i>= j){
      print(s"$j*$i=${i*j}\t${if (j==i) "\n" else ""}")
    }

    for (i <- 1 to 10 if i % 2 ==0; j <- 1 to 10 if j % i ==0){
      print(s"${if (j==i) "\n" else ""}i=$i j=$j\t")
    }
    println()
    breakable {
      for (i <- 1 to 10){
        if (i == 9) break else print(s"i=$i\t")
      }
    }
    println()
    for (i <- 1 to 10 if i<9){
      print(s"i=$i\t")
    }
//    println()
//    for (i <- 1 to 10){
//      if (i == 9) return else print(s"i=$i\t")
//    }
    println()
    val ve = for (i <- 1 to 10) yield i
    println(ve)

    println(for {
      i <- 0 to 2
      j <- "hello"
    } yield (i+j).toChar)
  }

}
