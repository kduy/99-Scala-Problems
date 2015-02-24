package org.p99.scala


/*Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*/
object P04 {

  def length[A] (ls : List[A]): Int = {
    ls.foldLeft(0) { (c, _) => c + 1 }
  }

  def main(args: Array[String]) {
    System.out.println(length(List(1,2,3,4)))
  }

}
