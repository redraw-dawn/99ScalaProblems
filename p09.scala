// P09 (**)
// Pack consecutive duplicates of list elements into sublists.
// If a list contains repeated elements they should be placed in separate sublists.
// Example:
// scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
// res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object problem9 {
  def main(args: Array[String]): Unit = {
    println("pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal:")
    println("List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)")
    println("Result:")
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)).toString)

    def pack[A](ls: List[A]): List[List[A]] = {
      def loop(ls: List[A], buildingList: List[A], accum: List[List[A]]): List[List[A]] = {
        ls match {
          
        }
      }
      loop(ls, Nil, Nil)
    }
  }
}
