package problems

import util.Util._

/**
  * P14 (*) Duplicate the elements of a list.
  * Example:
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */

class Problem14 extends Problem[List[Symbol]] {
  val number = 14
  val expectedAnswer = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  val actualAnswer = duplicate(List('a, 'b, 'c, 'c, 'd))

  def duplicate[A](ls: List[A]): List[A] = {
    ls match {
      case Nil => Nil
      case x :: xs => x :: x :: duplicate(xs)
    }
  }
}
