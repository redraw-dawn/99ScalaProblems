package problems

import util.Util._

/**
  * P07 (**)
  * Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Int] = List(1, 1, 2, 3, 5, 8)
  */

class Problem7 extends Problem[List[Any]] {
  val number = 7
  val expectedAnswer = List(1, 1, 2, 3, 5, 8)
  val actualAnswer = flatten(List(List(1, 1), 2, List(3, List(5, 8))))

  def flatten(ls: List[Any]): List[Any] = {
    ls match {
      case Nil => ls
      case x :: xs => x match {
        case y :: ys => flatten(y::ys) ::: flatten(xs)
        case z => z :: flatten(xs)
      }
    }
  }
}
