// P20 (*) Remove the Kth element from a list.
// Return the list and the removed element in a Tuple. Elements are numbered from 0.
// Example:

// scala> removeAt(1, List('a, 'b, 'c, 'd))
// res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

object p20 {
  def main(args: Array[String]): Unit = {
    println("removeAt(1, List('a, 'b, 'c, 'd))")
    println("(List[Symbol], Symbol) = (List('a, 'c, 'd),'b)")
    println("result:")
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  private def removeAt[A](index: Int, ls: List[A]): (List[A], A) = {
    def loop(index: Int, ls: List[A], accum: List[A]): (List[A], A) = (index, ls) match {
      case (_, Nil) => throw new Exception("Invalid arguments")
      case (0, x :: xs) => (accum ::: xs, x)
      case (_, x :: xs) => loop(index - 1, xs, accum ::: x :: Nil)
    }
    loop(index, ls, Nil)
  }
}
