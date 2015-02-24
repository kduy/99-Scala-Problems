package org.p99.scala

object P06 {

  def isPalindrome[A](ls : List[A]) : Boolean = ls ==ls.reverse

  def main(args: Array[String]) {
    System.out.println(isPalindrome(List(1,2,3,3,2,1)))
  }

}


