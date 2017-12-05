// P22 (*) Create a list containing all integers within a given range.
// Example:

// scala> range(4, 9)
// res0: List[Int] = List(4, 5, 6, 7, 8, 9)

object p22 extends App {
  private def range(min: Int, max: Int): List[Int] =
    loop(min, max, Nil)

  @annotation.tailrec
  private def loop(current: Int, max: Int, result: List[Int]): List[Int] =
    if (current > max)
      result
    else
      loop(current + 1, max, result ::: List(current))

  println("range(4, 9)")
  println("List(4, 5, 6, 7, 8, 9)")
  println("result:")
  println(range(4, 9))
}
