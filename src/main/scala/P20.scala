package org.p99.scala
/*Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)*/
object P20 {


  def removeAt[A](n: Int, list: List[A]): (List[A], A)= list.splitAt(n) match {
    case (Nil, _ ) if n < 0 => throw  new NoSuchElementException
    case (pre, e::post) => (pre:::post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }
  
  def removeAt2[A] (n: Int, list: List[A]): (List[A], A) = (n , list) match {

    case (0, h::tail) => (tail, h)
    case (n, h::tail) => {
      var (l , e) = removeAt2(n-1, tail)
      (h::l,e)
    }
    
  }
  def main(args: Array[String]) {
    println(removeAt2(1, List('a, 'b, 'c, 'd)))
  }
  
  
}
