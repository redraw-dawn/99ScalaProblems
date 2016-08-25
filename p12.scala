// P12 (**) Decode a run-length encoded list.
//     Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//     Example:
//     scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//     res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

object problem12 {
  def main(args: Array[String]): Unit = {
    println("decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal")
    println("List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
    println("Result:")
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }

  def decode[A](ls: List[(Int, A)]): List[A] = {
    def loop[A](ls: List[(Int, A)], accum: List[A]): List[A] = {
      ls match {
        case Nil => accum
        case (int, x) :: xs => loop(xs, accum ::: addX(int, x))
      }
    }
    loop(ls, Nil)
  }

  def addX[A](num: Int, x: A): List[A] = {
    if (num == 0)
      Nil
    else
      x :: addX(num - 1, x)
  }
}
