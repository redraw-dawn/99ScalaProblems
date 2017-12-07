package problems

import util.Util._

/**
  * P22 (*) Create a list containing all integers within a given range.
  * Example:
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */

class Problem22 extends Problem[List[Int]] {
  val number = 22
  val expectedAnswer = List(4, 5, 6, 7, 8, 9)
  val actualAnswer = range(4, 9)

  def range(min: Int, max: Int): List[Int] =
    loop(min, max, Nil)

  @annotation.tailrec
  private def loop(current: Int, max: Int, result: List[Int]): List[Int] =
    if (current > max)
      result
    else
      loop(current + 1, max, result ::: List(current))
}
