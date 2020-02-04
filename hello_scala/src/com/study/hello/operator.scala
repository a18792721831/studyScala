package com.study.hello

object operator {

  case class People(name: String, age: Int, money: Double){

    def +(people: People) : People = People(name + people.name , age + people.age , money + people.money )

    override def toString: String = super.toString + "name:" + name + "age" + age + "money" + money

  }

  def main(args: Array[String]): Unit = {
    val people1 = new People("xiaoli", 23, 676.88)
    val people2 = new People("xiaohuang", 34, 899999999.000)
    println(people1)
    println(people2)
    println(people1 + people2)
  }

}
