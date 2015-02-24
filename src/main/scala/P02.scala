package org.p99.scala

/*
*  Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
* */
object P02 {

  def peniltimate[A] ( list: List[A]):A  = list match {
    case a::_::Nil => a
    case _::tail => peniltimate(tail)
    case _ => throw new NoSuchElementException
      
  }
  
  def penultimateBuiltin [A] (list : List[A]) :A  = {
    if (list.isEmpty) {
      throw  new NoSuchElementException
    }

    list.init.last
//    list.takeRight(n).head
  }
  

  def main(args: Array[String]) {
    val list = List(0)
    System.out.println(peniltimate(list))
  }

}
