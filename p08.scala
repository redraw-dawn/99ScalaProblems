// P08 (**)
// Eliminate consecutive duplicates of list elements.
// If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
// Example:
// scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
// res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

object problem8 {
  def main(args: Array[String]): Unit = {
    println("Result of compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be List('a, 'b, 'c, 'a, 'd, 'e)")
    println("Result is: " + {compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))})
  }

  def compress[A](ls: List[A]): List[A] = {
    def loop(ls: List[A], accum: List[A]): List[A] = {
      ls match {
        case Nil => accum
        case a :: b :: bs =>
          if (a == b) loop(b :: bs, accum)
          else loop(b :: bs, accum ::: List(a))
        case x :: Nil => accum ::: List(x)
      }
    }
    loop(ls, Nil)
  }
}
