package app

import problems._
import util.Util._

object App extends App {

  private val allProblems: List[Problem[_]] = List(
    new Problem1,
    new Problem2,
    new Problem3,
    new Problem4,
    new Problem5,
    new Problem6,
    new Problem7,
    new Problem8,
    new Problem9,
    new Problem10,
    new Problem11,
    new Problem12,
    new Problem13,
    new Problem14,
    new Problem15,
    new Problem16,
    new Problem17,
    new Problem18,
    new Problem19,
    new Problem20,
    new Problem21,
    new Problem22
  )

  allProblems.foreach { problem =>
    problem.logResult

    if (problem.isCorrect)
      println("---")
    else
      throw new Exception(s"Problem ${problem.number} is not correct")
  }
}
