package problems

// P07 (**)
// Flatten a nested list structure.
// Example:

// scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object problem7 {
  def main(args: Array[String]): Unit = {
    println("result of flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be List(1, 1, 2, 3, 5, 8)")
    println("result:" + flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }

  def flatten(ls: List[Any]): List[Any] = {
    ls match {
      case Nil => ls
      case x :: xs => x match {
        case y :: ys => flatten(y::ys) ::: flatten(xs)
        case z => z :: flatten(xs)
      }
    }
  }
}
