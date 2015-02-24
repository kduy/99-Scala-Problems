package org.p99.scala

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.specs2.mutable._

@RunWith(classOf[JUnitRunner])
class P01Spec extends Specification {
   "List" should {
     "last element " in {
       P01.last(List(12,3,4,5)) mustEqual  (5)
     }
   }

}

