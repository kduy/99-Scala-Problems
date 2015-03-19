package org.p99.scala

/*Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)*/

object P16 {

  def drop[A](i: Int, list: List[A]): List[Any]= {
    list.take(i).init ++ list.takeRight(list.length-i)
    list.zipWithIndex filter { e=> e._2 + 1 != i} map {_._1}
  }

  def main(args: Array[String]) {
    print(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
 
  }

}
