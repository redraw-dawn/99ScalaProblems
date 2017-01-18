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
    def loop(num: Int, ls: List[A], collect: List[A]): (List[A], List[A]) = {
      ls match {
        case Nil =>
          (Nil, Nil)
        case x :: xs if num > 1 =>
          loop(num - 1, xs, collect ::: x :: Nil)
        case x :: xs =>
          (collect ::: x :: Nil, xs)
      }
    }
    loop(num, ls, Nil)
  }
}
