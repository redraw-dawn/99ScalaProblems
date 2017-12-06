package problems

import util.Util._

/**
  * P10 (*) Run-length encoding of a list.
  * Use the result of problem P09 to implement the so-called run-length encoding
  * data compression method. Consecutive duplicates of elements are encoded as
  * tuples (N, E) where N is the number of duplicates of the element E.
  * Example:
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */

class Problem10 extends Problem[List[(Int, Symbol)]] {
  val number = 10
  val expectedAnswer = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  val actualAnswer = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

  def encode[A](ls: List[A]): List[(Int, A)] = {
    val packedList = new Problem9().pack(ls)
    packedList.map { pack =>
      (pack.size, pack.head)
    }
  }
}
