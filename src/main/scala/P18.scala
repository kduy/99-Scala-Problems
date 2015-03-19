package org.p99.scala


/*(**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
*/
object P18 {


  def slice[A](i: Int, i1: Int, list: List[A]): List[A]= (i,i1,list) match {
    case (0,0,list)  => Nil
    case (0, i1, h::tail) => h::slice(0, i1-1, tail)
    case (i, i1, h::tail) => slice(i-1, i1-1, tail)
  }
  // second solution: ls.slice(3,7)
  // ls drop i take (i1 - (i max 0))

  def main(args: Array[String]) {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    
  }
}
