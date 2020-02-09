package com.study

class MyMatch {

  val times = (x: Int) => x match {
    case 1 => "one"
    case _ => "default"
  }
  def test(x: Int) = {
    x match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "default"
    }
  }

}
object MyMatch{
  def apply() = new MyMatch

  def main(args: Array[String]): Unit = {
    println(MyMatch().times(2))
    println(MyMatch().test(1))
  }
}

class MyMatch2(x: Int){
  def test() = "test" + x
}
object MyMatch2{
  def apply(x: Int) = new MyMatch2(x)

  def main(args: Array[String]): Unit = {
    val v1 = MyMatch2(4)
    println(v1.test)
  }
}
import scala.language.postfixOps
object Add {
  def main(args: Array[String]) = {
    println(new Liquor("Whisky") getName)
  }
}

class Liquor(name: String) {
  def getName() = this.name
}