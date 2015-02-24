package org.p99.scala

/*Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)*/

object P07 {
  
  def flatten[A] ( ls :List[Any]) :List[_] = ls flatMap
    {
      case ms:List[_] => flatten(ms)
      case e => List(e)
    }

  def main(args: Array[String]) {
    System.out.println(    flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }

}
