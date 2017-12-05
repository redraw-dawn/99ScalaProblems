package problems

import util.Util._

/**
  * P02 (*)
  * Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */

class Problem2 extends Problem[Int] {
  val number = 2
  val expectedAnswer = 5
  val actualAnswer = penultimate(List(1, 1, 2, 3, 5, 8))

  def penultimate[A](ls: List[A]): A = ls match {
    case x :: y :: Nil => x
    case x :: y :: xs => penultimate(y :: xs)
    case _ => throw new IllegalArgumentException("Cannot pass list that is empty or has 1 element")
  }
}
