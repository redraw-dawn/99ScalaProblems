package problems

import util.Util._
/**
  * P04 (*)
  * Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */

class Problem4 extends Problem[Int] {
  val number = 4
  val expectedAnswer = 6
  val actualAnswer = length(List(1, 1, 2, 3, 5, 8))

  def length[A](ls: List[A]): Int = {
    def loop(ls: List[A], count: Int): Int = {
      ls match {
        case Nil => count
        case x :: xs => loop(xs, count + 1)
      }
    }
    loop(ls, 0)
  }
}
