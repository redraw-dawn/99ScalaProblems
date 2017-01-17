// P16 (**) Drop every Nth element from a list.
// Example:

// scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

object p16 {
  def main(args: Array[String]): Unit = {
    println("drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)")
    println("result:")
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  private def drop[A](every: Int, ls: List[A]): List[A] = {
    def loop(every: Int, everyCount: Int, ls: List[A]): List[A] = {
      ls match {
        case Nil =>
          Nil
        case x :: xs if everyCount == 1 =>
          loop(every, every, xs)
        case x :: xs =>
          x :: loop(every, everyCount - 1, xs)
      }
    }
    loop(every, every, ls)
  }
}
