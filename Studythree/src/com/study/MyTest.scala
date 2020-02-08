package com.study

class MyTest {
  var id: Long = _
  var name: String = _
  private var age: Int = _
  def getAge: Int = age
  def setAge(age: Int): Unit = this.age = age
  override def toString: String = "id:" + this.id +",name:" + this.name + ",age:" + this.age
  val gAge = () => println(this.age)
  val sAge = (age: Int) => {
    this.age = age
    age
  }
}
object MyTest{
  def main(args: Array[String]): Unit = {
    val myTest = new MyTest()
    println(myTest)
    myTest.id = 1L
    myTest.name = "lili"
    myTest.age = 234
    println(myTest)
    println(myTest.getAge)
    myTest.setAge(0)
    println(myTest)
    println()
    println(myTest.gAge)
    println(myTest.sAge)
    myTest.gAge
    println(myTest.sAge(3))
    println(myTest.getAge)
  }
}
