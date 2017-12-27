package problems

import util.Util._

/**
  * P25 (*) Generate a random permutation of the elements of a list.
  * Hint: Use the solution of problem P23.
  * Example:
  * scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  * res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */

class Problem25 extends ProblemWithValidation[List[Symbol]] {
  val number = 25
  val expectedAnswer = List('b, 'a, 'd, 'c, 'e, 'f)
  val actualAnswer = randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))

  protected def validation =
    actualAnswer.size == expectedAnswer.size &&
  expectedAnswer.forall(actualAnswer.contains)

  def randomPermute[A](ls: List[A]): List[A] =
    new Problem23().randomSelect(ls.size, ls)
}
