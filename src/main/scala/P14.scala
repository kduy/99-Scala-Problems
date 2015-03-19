package org.p99.scala

/*
Duplicate the elements of a list.
Example:
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/


object P14 {
  
  def duplicate[A](l : List[A]): List[A] ={
    
    if(l.isEmpty) Nil
    else{
      l.head::l.head::duplicate(l.tail)
    }
  }
  
  
  // second solution:      l flatmat {e => List(e, e)}

  def main(args: Array[String]) {
    print(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

}
