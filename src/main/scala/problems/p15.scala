package problems

// P15 (**) Duplicate the elements of a list a given number of times.
// Example:

// scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
// res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

object p15 {
  def main(args: Array[String]): Unit = {
    println("duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal")
    println("List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)")
    println("result:")
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

  private def duplicateN[A](amount: Int, ls: List[A]): List[A] = {
    ls match {
      case Nil => Nil
      case x :: xs => duplicationHelper(amount, x) ::: duplicateN(amount, xs)
    }
  }

  private def duplicationHelper[A](amount: Int, member: A): List[A] = {
    if (amount <= 0) Nil
    else member :: duplicationHelper(amount - 1, member)
  }
}
