// P18 (**) Extract a slice from a list.
// Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.

// Example:

// scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res0: List[Symbol] = List('d, 'e, 'f, 'g)

object p18 {
  def main(args: Array[String]): Unit = {
    println("slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))")
    println("List[Symbol] = List('d, 'e, 'f, 'g)")
    println("result:")
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  private def slice[A](from: Int, to: Int, ls: List[A]): List[A] = (from, to, ls) match {
    case (_, 0, ls) => Nil
    case (x, y, l :: ls) if x >= 1 => slice(x - 1, y - 1, ls)
    case (x, y, l :: ls) => l :: slice(x -1, y - 1, ls)
  }
}
