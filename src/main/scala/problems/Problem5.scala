package problems

import util.Util._

/**
  * P05 (*)
  * Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */

class Problem5 extends Problem[List[Int]] {
  val number = 5
  val expectedAnswer = List(8, 5, 3, 2, 1, 1)
  val actualAnswer = reverse(List(1, 1, 2, 3, 5, 8))

  def reverse[A](ls: List[A]): List[A] = {
    def loop(ls: List[A], result: List[A]): List[A] = {
      ls match {
        case Nil => result
        case x :: xs => loop(xs, x :: result)
      }
    }
    loop(ls, Nil)
  }
}
