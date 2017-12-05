package problems

import util.Util._

/**
  * P01 (*)
  * Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */

class Problem1 extends Problem[Int] {
  val number = 1
  val expectedAnswer = 8
  val actualAnswer = last(List(1, 1, 2, 3, 5, 8))

  def last[A](ls: List[A]): A = {
    ls match {
      case x :: Nil => x
      case x :: xs => last(xs)
      case Nil => throw new IllegalArgumentException("Cannot pass empty list to last")
    }
  }
}
