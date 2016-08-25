// P13 (**) Run-length encoding of a list (direct solution).
//     Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
//     Example:
//     scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

object p13 {
  def main(args: Array[String]): Unit = {
    println("encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal")
    println("List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))")
    println("Result:")
    println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encodeDirect[A](ls: List[A]): List[(Int, A)] = {
    def loop(ls: List[A], last: Option[A], counter: Int, accum: List[(Int, A)]): List[(Int, A)] = {
      ls match {
        case Nil => last match {
          case None => accum
          case Some(x) => (counter, x) :: accum
        }
        case x :: xs =>
          last match {
            case None =>
              loop(xs, Some(x), 1, accum)
            case Some(sym) =>
              if (x == sym)
                loop(xs, Some(sym), counter + 1, accum)
              else
                loop(xs, Some(x), 1, (counter, sym) :: accum)

          }
      }
    }
    reverse(loop(ls, None, 0, Nil))
  }

  def reverse[A](ls: List[A]): List[A] = {
    def loop(ls: List[A], accum: List[A]): List[A] = {
      ls match {
        case Nil => accum
        case x :: xs => loop(xs, x :: accum)
      }
    }
    loop(ls, Nil)
  }
}
