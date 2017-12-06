package problems

import util.Util._

/**
  * P16 (**) Drop every Nth element from a list.
  * Example:
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */

class Problem16 extends Problem[List[Symbol]] {
  val number = 16
  val expectedAnswer = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  val actualAnswer = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  def drop[A](every: Int, ls: List[A]): List[A] = {
    def loop(every: Int, everyCount: Int, ls: List[A]): List[A] = {
      ls match {
        case Nil =>
          Nil
        case x :: xs if everyCount == 1 =>
          loop(every, every, xs)
        case x :: xs =>
          x :: loop(every, everyCount - 1, xs)
      }
    }
    loop(every, every, ls)
  }
}
