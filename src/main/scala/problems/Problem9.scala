package problems

import util.Util._

/**
  *
  * P09 (**)
  * Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */


class Problem9 extends Problem[List[List[Symbol]]] {
  val number = 9
  val expectedAnswer = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  val actualAnswer = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

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
    new Problem5().reverse(loop(ls, Nil, Nil))
  }
}
