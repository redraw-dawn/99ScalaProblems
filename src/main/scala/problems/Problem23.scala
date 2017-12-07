package problems

import util.Util._

/**
  * P23 (**) Extract a given number of randomly selected elements from a list.
  * Example:
  * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  * res0: List[Symbol] = List('e, 'd, 'a)
  *
  * Hint: Use the solution to problem P20
  */

class Problem23 extends ProblemWithValidation[List[Symbol]] {
  val number = 23
  val expectedAnswer = List('g, 'd, 'a)
  val actualAnswer = randomSelect(3, originalArgument)

  protected def validation =
    actualAnswer.size == 3 && actualAnswer.forall(originalArgument.contains)

  private lazy val originalArgument = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
  private lazy val r = scala.util.Random
  private lazy val problem20 = new Problem20

  def randomSelect[A](num: Int, ls: List[A]): List[A] = {
    def loop(num: Int, ls: List[A], result: List[A]): List[A] = {
      if (num == 0)
        result
      else if (ls.isEmpty)
        throw new IllegalArgumentException("Number too large or list not long enough")
      else {
        val (removedLs, removedA) = problem20.removeAt(r.nextInt(num), ls)
        loop(num - 1, removedLs, removedA :: result)
      }
    }

    loop(num, ls, Nil)
  }
}
