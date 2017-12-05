package problems

// P17 (*) Split a list into two parts.
// The length of the first part is given. Use a Tuple for your result.

// Example:

// scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

object p17 {
  def main(args: Array[String]): Unit = {
    println("split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("(List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("result:")
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  private def split[A](num: Int, ls: List[A]): (List[A], List[A]) = {
    def loop(num: Int, ls: List[A], result: List[A]): (List[A], List[A]) = (num, ls) match {
      case (_, Nil) => (Nil, Nil)
      case (0, l) => (result, l)
      case (y, x :: xs) => loop(y - 1, xs, result ::: List(x))
    }
    loop(num, ls, Nil)
  }
}
