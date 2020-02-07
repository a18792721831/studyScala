package com.study

object TestApply {

  def apply() = println("TestApply")

}

object TestMain{
  def main(args: Array[String]): Unit = {
    TestApply()
  }
}
