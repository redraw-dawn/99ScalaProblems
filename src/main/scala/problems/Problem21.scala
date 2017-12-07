package problems

import util.Util._

/**
  * P21 (*) Insert an element at a given position into a list.
  * Example:
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */

class Problem21 extends Problem[List[Symbol]] {
  val number = 21
  val expectedAnswer = List('a, 'new, 'b, 'c, 'd)
  val actualAnswer = insertAt('new, 1, List('a, 'b, 'c, 'd))

  def insertAt[A](insert: A, index: Int, ls: List[A]): List[A] =
    if (index == 0)
      insert :: ls
    else {
      if (ls.isEmpty)
        throw new Exception("Index is too large")
      else
        ls.head :: insertAt(insert, index - 1, ls.tail)
    }
}
