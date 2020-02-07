package com.study

trait MyTrait {
  def test: Unit
}

class Frist extends MyTrait{
  override def test: Unit = println("frist class")
}

class Second extends Frist{
  override def test: Unit = {
    super.test
    println("second class")
  }
}

object Three extends MyTrait{
  override def test: Unit = println("three object")
}

object demo{

  def main(args: Array[String]): Unit = {
    Three.test
    val frist = new Frist
    frist.test
    val second = new Second
    second.test
    val three = Three
    val test = new MyTrait {
      override def test: Unit = println("inner")
    }
    test.test
    println(test)
  }

}

trait Mytrait2{
  def say[a]
}

class All extends MyTrait with Mytrait2{
  override def test: Unit = println(" 我是 test  ")

  override def say[a]: Unit = println("我是 say")
}

object All{

  def apply() = new All

  def main(args: Array[String]): Unit = {
    val all = All()
    all.test
    all.say
  }
}

class Student{
  def dosomething = println("do something")
}

object Student{

  def apply()=new Student with MyTrait {
    override def test: Unit = println("内部实现")
  }

  def main(args: Array[String]): Unit = {
    val student = Student()
    student.test
    student.dosomething
  }

}