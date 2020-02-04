package com.study.clazz

class People(val name: String, age: Int, sex: Boolean) {

  val name1: String="sss";

  override def toString: String = "name=" + name +",age=" + age + ",sex:" +sex;
  //注意：scala中没有 ? :   三目运算符

//  def say(): String = s"name=${this.name},age=$age,sex=$sex"

  def say(other: People): String = s"name=${this.name} : ${other.name},"
}
