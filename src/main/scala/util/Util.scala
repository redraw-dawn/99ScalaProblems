package util

object Util {

  trait Problem[T] {
    val number: Int

    val expectedAnswer: T
    val actualAnswer: T

    def isCorrect: Boolean = expectedAnswer == actualAnswer
  }
}
