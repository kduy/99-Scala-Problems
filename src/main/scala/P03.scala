package org.p99.scala

//Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example:
//
//scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2

object P03 {

  def nth[A] (n : Int, list : List[A]): A =  list match {
//    list.take(n+1).last
    case Nil if n > 0 => throw  new NoSuchElementException
    case a::tail if n == 0 => a
    case _::tail => nth(n-1, tail)
  }

  def main(args: Array[String]) {
    System.out.println(nth(2, List(0,1,2,3)))
  }
}
