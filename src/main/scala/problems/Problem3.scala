package problems

import util.Util._

/**
  * P03 (*)
  * Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */

class Problem3 extends Problem[Int] {
  val number = 3
  val expectedAnswer = 2
  val actualAnswer = nth(2, List(1, 1, 2, 3, 5, 8))

  def nth[A](num: Int, ls: List[A]): A = {
    if (num < 0 || ls.length <= num)
      throw new IllegalArgumentException("Cannot have a list shorter than n")
    else if (num == 0)
      ls.head
    else
      nth(num -1, ls.tail)
  }
}
