package org.p99.scala


//P01 (*) Find the last element of a list.
//Example:
//scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8

object P01 {
  def last[A](ls : List[A]) : A = ls match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

}
