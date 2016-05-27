// P05 (*)
// Reverse a list.
// Example:

// scala> reverse(List(1, 1, 2, 3, 5, 8))
// res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object problem5 {
  def main(args: Array[String]): Unit = {
    println("the result to this problem should be List(8, 5, 3, 2, 1, 1)")
    println("result: " + reverse(List(1, 1, 2, 3, 5, 8)))
  }

  def reverse[A](ls: List[A]): List[A] = {
    def loop(ls: List[A], result: List[A]): List[A] = {
      ls match {
        case Nil => result
        case x :: xs => loop(xs, x :: result)
      }
    }
    loop(ls, Nil)
  }
}
