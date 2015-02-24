package org.p99.scala

object P11 {
  import  P10.encode
  def encodeModified [A] (ls :List[A]) : List[Any] = {
    encode(ls).map(x=>{if (x.head == 1) x.last else x})

  }

  def main(args: Array[String]) {
    System.out.println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
