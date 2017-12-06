package problems

import util.Util._

/**
  * P11 (*) Modified run-length encoding.
  * Modify the result of problem P10 in such a way that if an element has no
  * duplicates it is simply copied into the result list. Only elements with
  * duplicates are transferred as (N, E) terms.
  * Example:
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */


class Problem11 extends Problem[List[Any]] {
  val number = 11
  val expectedAnswer = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  val actualAnswer = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

  def encodeModified[A](ls: List[A]): List[Any] = {
    val packedList = new Problem9().pack(ls)
    packedList.map { pack =>
      val packSize = pack.size
      if (packSize == 1)
        pack.head
      else
        (pack.size, pack.head)
    }
  }
}
