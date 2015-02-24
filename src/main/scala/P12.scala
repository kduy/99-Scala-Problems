package org.p99.scala

object P12 {

  def decode[A] (ls : List[(Int, A)]): List[A] ={
    ls flatMap {e => List.make(e._1, e._2)}
    
  }

  def main(args: Array[String]) {
    System.out.println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}
