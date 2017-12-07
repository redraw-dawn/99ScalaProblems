package util

object Util {

  trait Problem[T] {
    val number: Int

    val expectedAnswer: T
    val actualAnswer: T

    def isCorrect: Boolean = expectedAnswer == actualAnswer

    def logResult: Unit = {
      println(s"Problem Number: ${number}")
      println(s"Expected: ${expectedAnswer}")
      println(s"Actual: ${actualAnswer}")
      println(s"Correct: ${isCorrect}")
    }
  }

  trait ProblemWithValidation[T] extends Problem[T] {
    protected def validation: Boolean

    override def isCorrect = validation
    override def logResult: Unit = {
      println("N.B. Answers for this question are not exact and are validated instead")
      super.logResult
    }
  }
}
