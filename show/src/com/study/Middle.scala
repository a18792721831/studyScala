package com.study
import scala.language.postfixOps
class Middle(v: Int){
  val add = (x: Middle) => this.v + x.getV

  def getV = this.v
}
object Middle{

  def apply(x: Int) = new Middle(x)

  def main(args: Array[String]): Unit = {
    val xs = Middle(3)
    val xsw = Middle(4)
    println(xs add xsw)
    println(xs.add(xsw))
    println(Middle(8) add Middle(10))
    println(Middle(8).add(Middle(10)))
    println(Middle(19) getV)
    println(Middle(19).getV)
  }
}