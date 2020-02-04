package com.study.hello

object TestClass {

  case class numberSum(sum: Int){

    def add(m: Int): Int = sum + m

    def +(n: numberSum) = numberSum(sum + n.sum)

    def ==(n: numberSum)= sum == n.sum

    def ->(n: numberSum) = sum*n.sum

    def ^(n: numberSum) = {
      var result = sum
      (1 to  n.sum - 1 ).foreach(x => result *= sum)
      result
    }

    override def toString: String = super.toString + "sum is " + sum

  }

  def main(args: Array[String]): Unit = {

    val num1 = new numberSum(1)
    val num2 = new numberSum(2)
    println(num1 + num2)
    println(num1 == num2)
    println(num1 -> num2)
    println(num2 ^ numberSum(10))

//    val list = List(1,2,3,4,5)
//    val set = Set(9,8,7,6,5)
//    val yz = ("yuanzu" -> 1,"haha" -> 2)
//    println(list)
//    println(set)
//    println(yz)
//    println(list.map(_*2))
//    println(list.zip(set))
//    println(yz._1)
//    println(list.::(set))
//    println(set::list)
//    println(list.:::(list.map(_*2)))
//    println(list.::(list.foreach(_*2)))
//    println(list++list)
//    println(list:+3)
//    println(4+:list)
//    println(Nil+:list)



  }

}
