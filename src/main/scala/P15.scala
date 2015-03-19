package org.p99.scala

/*(**) Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)*/

object P15 {

  def duplicateN[A](i: Int, list: List[A]): Any = {
    list flatMap  {e => List.make(i, e)}
    
  }

  def main(args: Array[String]) {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

}
