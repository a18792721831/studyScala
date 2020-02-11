package com.study

class TargetClass {

  var name = ""
  var value = ""

}

class MyMatch {

  //匹配值
  val times = (x: Int) => x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "default"
  }

  //守卫匹配
  def test(x: Int) = {
    x match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "default"
    }
  }

  //匹配类型+变量
  val testType = (x: AnyVal) => x match {
    case i: Int if i < 0 => s"i:Int,i<0,i=$i"
    case i: Int if i == 0 => s"i:Int,i=0,i=$i"
    case i: Int if i > 0 => s"i:Int,i>0,i=$i"
    case d: Double if d > 0.0 => s"d:Double,d>0.0,d=$d"
    case d: Double if d == 0.0 => s"d:Double,d=0.0,d=$d"
    case d: Double if d < 0.0 => s"d:Double,d<0.0,d=$d"
  }
  //匹配类成员
  val testClass = (x: TargetClass) => x match {
    case x if x.name == "ss" && x.value == "23" => "ss23"
    case m if m.name == "pp" && m.value == "22" => "pp22"
    case _ => "nothing"
  }
  //匹配数组
  val testArr = (arr: Array[Int]) => arr match {
    case Array(0) => s"Array[0]:arr=$arr"
    case Array(x, y) => s"Array[x,y]:arr=$arr,x=$x,y=$y"
    case Array(0, _*) => s"start by 0"
    case Array(1, v@_*) => s"start by 1 and the value is $v"
    case _ => "other"
  }
  //匹配列表
  val testList = (lis: List[Int]) => lis match {
    case 0 :: Nil => "list only 0"
    case Nil => "empty list"
    case x :: y :: Nil => s"start with x = $x ,end with y=$y"
    case 0 :: tail => s"start with 0,other is tail = $tail"
    case x :: middle :: y :: Nil => s"only three,start with x = $x ,middle = $middle ,and end with y = $y"
    case x :: y :: other => s"morethan 2,start with $x,and $y,ohther is $other"
    case _ => "others"
  }
  //匹配元组
  val testTuple = (tp: (String, String)) => tp match {
    case ("s", "s") => s"('s','s')"
    case (x, y) => s"($x,$y)"
    case ("0", y) => s"('0',$y)"
    case (x, "1") => s"($x,'1')"
    case _ => "other"
  }
  //可选分支
  val testIf = (tp: (Int, Int)) => tp match {
    case (0, _) | (_, 0) => s"start with 0 or end with 0 : $tp"
    case (1, _) | (_, 1) => s"start with 1 or end with 1 : $tp"
    case _ => s"others : $tp"
  }
}

object MyMatch {
  def apply() = new MyMatch

  def main(args: Array[String]): Unit = {
    val obj = MyMatch()
    println(obj.times(2))
    println(obj times 2)
    println(obj.test(1))
    println(obj test 2)
    println("#################testType#####################")
    println(obj testType 8)
    println(obj testType 0)
    println(obj testType -9)
    println(obj testType 0.0)
    println(obj testType 0.3)
    println(obj testType -0.4)
    println("#################testClass#####################")
    val ob2 = new TargetClass
    ob2.name = "ss"
    ob2.value = "23"
    println(obj testClass ob2)
    ob2.name = "pp"
    ob2.value = "22"
    println(obj testClass ob2)
    ob2.value = "33"
    println(obj testClass ob2)
    println("#################testArr#####################")
    println(obj testArr Array(0))
    println(obj testArr Array(22, 55))
    println(obj testArr Array(34))
    println(obj testArr Array(0, 1, 2, 3, 4))
    println(obj testArr Array(1, 2, 3, 4, 5, 6))
    println("#################testList#####################")
    println(obj testList List(0))
    println(obj testList List())
    println(obj testList List(1, 2))
    println(obj testList List(0, 1, 2, 3, 4, 5))
    println(obj testList List(1, 2, 3))
    println(obj testList List(1, 2, 3, 4))
    println("#################testTuple#####################")
    println(obj testTuple("s", "s"))
    println(obj testTuple("i", "u"))
    println(obj testTuple("0", "2"))
    println(obj testTuple("my", "1"))
    println(obj testTuple("other", "others"))
    println("#################testIf#####################")
    println(obj testIf (0,1))
    println(obj testIf (1,0))
    println(obj testIf (0,0))
    println(obj testIf (1,2))
    println(obj testIf (2,1))
    println(obj testIf (2,2))
    println(obj testIf (66,66))
    println("#################extractor#####################")
    println(List(1,2,3,4) unapply 2)
    println(Array(1,2,3,4,5,6) unapply 2)
    println(Array unapplySeq Array(1,2,3,4,5))
  }
}
