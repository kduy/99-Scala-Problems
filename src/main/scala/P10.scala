package org.p99.scala

object P10 {
  import P09.pack
  def encode [A] (ls :List[A]) : List[List[Any]] = {
    pack(ls).map(x=>List(x.length, x.head))
    
  }

  def main(args: Array[String]) {
    System.out.println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
