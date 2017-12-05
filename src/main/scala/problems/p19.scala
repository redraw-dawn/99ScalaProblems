package problems

// P19 (**) Rotate a list N places to the left.
// Examples:
// scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

// scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

object p19 {
  def main(args: Array[String]): Unit = {
    println("rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)")
    println("result:")
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println()
    println("rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)")
    println("result:")
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  private def rotate[A](num: Int, ls: List[A]): List[A] = {
    def loop(num: Int, ls: List[A]): List[A] = (num, ls) match {
      case (_, Nil) => Nil
      case (0, _) => ls
      case (_, x :: xs) => loop(num - 1, xs ::: x :: Nil)
    }
    val rotations = if (num > 0) num else num + ls.length
    loop(rotations, ls)
  }
}
