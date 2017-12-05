package problems

// P10 (*) Run-length encoding of a list.
//   Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
// Example:
// scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
// res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

object problem10 {
  def main(args: Array[String]): Unit = {
    println("encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal:")
    println("List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))")
    println("result:")
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode[A](ls: List[A]): List[(Int, A)] = {
    val packedList = pack(ls)
    packedList.map { pack =>
      (pack.size, pack.head)
    }
  }

  def pack[A](ls: List[A]): List[List[A]] = {
    def loop(ls: List[A], buildingList: List[A], accum: List[List[A]]): List[List[A]] = {
      ls match {
        case Nil =>
          if (buildingList.isEmpty)
            accum
          else
            buildingList :: accum
        case x :: xs =>
          buildingList.headOption match {
            case Some(y) if x == y =>
              loop(ls.tail, x :: buildingList, accum)
            case _ =>
              if (buildingList.isEmpty)
                loop(ls.tail, x :: Nil, accum)
              else
                loop(ls.tail, x :: Nil, buildingList :: accum)
          }
      }
    }
    reverse(loop(ls, Nil, Nil))
  }

  def reverse[A](ls: List[A]): List[A] = {
    def loop[A](ls: List[A], accum: List[A]): List[A] = {
      ls match {
        case Nil => accum
        case x :: xs => loop(xs, x :: accum)
      }
    }
    loop(ls, Nil)
  }
}
