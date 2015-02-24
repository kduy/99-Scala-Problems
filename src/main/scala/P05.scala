package org.p99.scala

object P05 {

  def reverseFunc [A] (ls : List[A]) : List[A] = {
     ls.foldLeft(List[A]()) {(l, r ) => r::l}
  }
  
  def reverseTailRecursion [A] (resultLs : List[A], curLs: List[A]) : List[A] = curLs match {
    case Nil => resultLs
    case a::tail => reverseTailRecursion(a::resultLs, tail)
  }

  def main(args: Array[String]) {
    System.out.println(reverseTailRecursion(List(),List(1,2,3)))
  }

}
