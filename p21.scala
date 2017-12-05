// P21 (*) Insert an element at a given position into a list.
//   Example:

// scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
// res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

object p21 extends App {
  private def insertAt[A](insert: A, index: Int, ls: List[A]): List[A] = {
    if (index == 0)
      insert :: ls
    else {
      if (ls.isEmpty)
        throw new Exception("Index is too large")
      else
        ls.head :: insertAt(insert, index - 1, ls.tail)
    }
  }

  println("insertAt('new, 1, List('a, 'b, 'c, 'd))")
  println("List('a, 'new, 'b, 'c, 'd)")
  println("result:")
  println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
}
