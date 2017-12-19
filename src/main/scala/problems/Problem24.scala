package problems

import util.Util._

/**
  * P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  * Example:
  * scala> lotto(6, 49)
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */

class Problem24 extends ProblemWithValidation[List[Int]] {
  val number = 24
  val expectedAnswer = List(23, 1, 17, 33, 21, 37)
  val actualAnswer = lotto(6, 49)

  def validation = {
    val result = lotto(6, 49)
    result.length == 6 && result.forall(_ < 49)
  }

  private def lotto(amount: Int, max: Int, accum: List[Int] = Nil): List[Int] =
    if (amount == 0)
      accum
    else {
      val r = scala.util.Random
      lotto(amount - 1, max, r.nextInt(max) :: accum)
    }
}
