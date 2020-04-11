package com.study.mycaseclass

object Test {

  def main(args: Array[String]): Unit = {
    val fuc = (v: People) => v match {
      case Man(value, name) => println(s"man : value=$value, name=$name, man=$v")
      case Woman(name) => println(s"woman : name=$name, woman=$v")
      case Child => println(s"child ,child=$v")
      case _ => println(s"others, v=$v")
    }

    fuc(Man("man", "name"))
    fuc(Woman("woman"))
    fuc(Child)
    fuc(new People {})

    //copy方法
    val man = Man("man","name")
    val man1 = man.copy()
    println(man1.name+man1.value)
    //copy方法带参拷贝
    val man2 = man.copy(value = "man2")
    println(man2.name+man2.value)
    val man3 = man2.copy(name = "man3")
    println(man3.name+man3.value)
  }

}
