package app

import problems._
import util.Util._

object App extends App {

  private val allProblems: List[Problem[_]] = List(
    new Problem1,
    new Problem2
  )

  allProblems.foreach { problem =>
    println(s"Problem Number: ${problem.number}")
    println(s"Expected: ${problem.expectedAnswer}")
    println(s"Actual: ${problem.actualAnswer}")
    println(s"Correct: ${problem.isCorrect}")
    println("---")
  }
}
