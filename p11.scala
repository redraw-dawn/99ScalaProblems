// P11 (*) Modified run-length encoding.
//     Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
//     Example:
//     scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

object problem11 {
  def main(args: Array[String]): Unit = {
    println("encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) should equal:")
    println("List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))")
    println("result:")
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encodeModified[A](ls: List[A]): List[Any] = {
    val packedList = pack(ls)
    packedList.map { pack =>
      val packSize = pack.size
      if (packSize == 1)
        pack.head
      else
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
