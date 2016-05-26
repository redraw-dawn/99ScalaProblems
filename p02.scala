// P02 (*)
// Find the last but one element of a list.
// Example:
// scala> penultimate(List(1, 1, 2, 3, 5, 8))
// res0: Int = 5

object problem2 {
  def main(args: Array[String]): Unit = {
    println("result of problem must be 5")
    println("result: " + penultimate(List(1, 1, 2, 3, 5 ,8)))
  }

  def penultimate(ls: List[Int]): Int = {
    def loop(xs: List[Int], result: Int): Int = {
      xs match {
        case x :: Nil => result
        case x :: y :: xs => loop(y :: xs, x)
        case Nil => -1
      }
    }
    loop(ls, -1)
  }
}
