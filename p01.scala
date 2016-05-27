// P01 (*)
// Find the last element of a list.
//   Example:

// scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object problem1 {
  def main(args: Array[String]): Unit = {
    println("result of problem must be 8")
    println("result: " + last(List(1, 1, 2, 3, 5, 8)))
  }

  def last[A](ls: List[A]): A = {
    ls match {
      case x :: Nil => x
      case x :: xs => last(xs)
      case Nil => throw new IllegalArgumentException("Cannot pass empty list to last")
    }
  }
}
