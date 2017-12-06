package problems

import util.Util._

/**
  * P18 (**) Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from
  *  and including the Ith element up to but not including the Kth element of the
  *  original list. Start counting the elements with 0.
  * Example:
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */

class Problem18 extends Problem[List[Symbol]] {
  val number = 18
  val expectedAnswer = List('d, 'e, 'f, 'g)
  val actualAnswer = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  def slice[A](from: Int, to: Int, ls: List[A]): List[A] = (from, to, ls) match {
    case (_, 0, ls) => Nil
    case (x, y, l :: ls) if x >= 1 => slice(x - 1, y - 1, ls)
    case (x, y, l :: ls) => l :: slice(x -1, y - 1, ls)
  }
}
