package org.p99.scala
/*Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)*/
object P08 {
  def compress[A] (ls: List[A]) : List[A] = {
    //You could also take advantage of the CanBuildFrom instance,
    //ls.to[Set].toList   
    //collection.SortedSet(ls: _*).toList
    
    def compressRec(resultLs : List[A], curLs : List[A]) : List[A] = curLs match {
      case h::tail => compressRec( h::resultLs, tail.dropWhile(_ == h))
      case Nil => resultLs
    }
    compressRec(List(), ls)
    
  }

  def main(args: Array[String]) {
      System.out.println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}

/*


def compress[A] (ls: List[A]) : List[A] = {


}

def main(args: Array[String]) {

}
*/

/*

val myList = List(3,2,1,9)
myList.to[SortedSet]

*/



