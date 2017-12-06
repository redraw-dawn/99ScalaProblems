package problems

import util.Util._

/**
  * P19 (**) Rotate a list N places to the left.
  * Examples:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */

class Problem19 extends Problem[(List[Symbol], List[Symbol])] {
  val number = 19
  val expectedAnswer = (
    List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c),
    List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  )
  val actualAnswer = (
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)),
    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  )

  def rotate[A](num: Int, ls: List[A]): List[A] = {
    def loop(num: Int, ls: List[A]): List[A] = (num, ls) match {
      case (_, Nil) => Nil
      case (0, _) => ls
      case (_, x :: xs) => loop(num - 1, xs ::: x :: Nil)
    }
    val rotations = if (num > 0) num else num + ls.length
    loop(rotations, ls)
  }
}
