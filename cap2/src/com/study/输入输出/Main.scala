package com.study.输入输出

import scala.io.StdIn

object Main {

  /**
    *  scala输出有三种风格的输出方式
    *  java: print println
    *  c++: printf
    *  scala: java + c++ : f前缀、s前缀、raw前缀
    *  其中raw前缀不进行任何转义
    *  f、s、raw都支持使用$代入变量，使用${}计算表达式
    *
    *  scala输入需要导入io包中的StdIn
    *  StdIn中的readLine可以带输出提示信息，支持scala的输出的所有格式
    *  StdIn对8大基本类型进行封装，不支持带提示信息
    */
  def main(args: Array[String]): Unit = {

    //java风格
    println("有换行符")
    print("无换行符")
    println()

    //c++风格
    printf("hello, %d is number int%n",78)
    printf("hello, %4.2f is number float%n", 3333.44444444)
    printf("hello, %n")

    //scala风格
    val name = "ssss"
    val age = 77
    println(f"hello, ${name} you are ${age}")
    println(s"hello, ${name} you are ${age}")
    println(raw"hello, ${name} you are ${age}")
    val number = 7.777777
    println(f"hello, ${name} you have ${number}%3.2f")
    println(s"hello, ${name} you have ${number}%3.2f")
    println(raw"hello, ${name} you have ${number}%3.2f")

    println(s"hello \n")
    println(raw"hello \n")
    println(f"$name")
    println(s"$name")
    println(raw"$name")
    println("$$")
    println(f"$$$$")
    println(s"$$$$")
    println(raw"$$$$")
    println("age + number")
    println(f"${age + number}")
    println(s"${age + number}")
    println(raw"${age + number}")
    println(f"$age + $number\n")
    println(s"$age + $number\n")

    val name1 = StdIn.readLine(s"hello, $name, input other")
    val name2 = StdIn.readLine("hello , %s,intput other",name1)
    println(name2)

    println("your age:")
    val age2 = StdIn.readInt()
    println(s"next years you are ${age2 + 1}")
    println(f"next years you are ${age2 + 1}")
  }

}
