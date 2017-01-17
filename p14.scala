// P14 (*) Duplicate the elements of a list.
// Example:

// scala> duplicate(List('a, 'b, 'c, 'c, 'd))
// res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

object p14 {
  def main(args: Array[String]): Unit = {
    println("duplicate(List('a, 'b, 'c, 'c, 'd)) should equal")
    println("List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)")
    println("result")
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicate[A](ls: List[A]): List[A] = {
    ls match {
      case Nil => Nil
      case x :: xs => x :: x :: duplicate(xs)
    }
  }
}
