package problems

import util.Util._

/**
  * P17 (*) Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */

class Problem17 extends Problem[(List[Symbol], List[Symbol])] {
  val number = 17
  val expectedAnswer = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val actualAnswer = split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  def split[A](num: Int, ls: List[A]): (List[A], List[A]) = {
    def loop(num: Int, ls: List[A], result: List[A]): (List[A], List[A]) = (num, ls) match {
      case (_, Nil) => (Nil, Nil)
      case (0, l) => (result, l)
      case (y, x :: xs) => loop(y - 1, xs, result ::: List(x))
    }
    loop(num, ls, Nil)
  }
}
