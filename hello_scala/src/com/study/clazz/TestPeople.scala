package com.study.clazz

object TestPeople {

  def main(args: Array[String]): Unit = {
    val people1 = new People2("张三",24,true)
    val people2 = new People2("李四",44,false)
    println(people1)
    println(people2)
//    println(people1.say())
//    println(people1.say(people2) )
  }


  class People2(name: String, age: Int, sex: Boolean) {

    val name1: String="sss";

    override def toString: String = "name=" + name +",age=" + age + ",sex:" +sex;
    //注意：scala中没有 ? :   三目运算符

    //  def say(): String = s"name=${this.name},age=$age,sex=$sex"

//    def say(other: People2): String = s"name=${this.name} : ${other.name},"
  }


}
