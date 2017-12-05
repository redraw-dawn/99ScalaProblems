package problems

// P06 (*)
// Find out whether a list is a palindrome.
// Example:

// scala> isPalindrome(List(1, 2, 3, 2, 1))
// res0: Boolean = true

object problem6 {
  def main(args: Array[String]): Unit = {
    println("result to function must be true")
    println("result: " + isPalindrome(List(1, 2, 3, 2, 1) ) )
  }

  def isPalindrome[A](ls: List[A]): Boolean = {
    def loop(ls: List[A], index: Int): Boolean = {
      if (index > ls.length / 2 ) true
      else if (ls(index) == ls((ls.length - 1) - index)) loop(ls, index + 1)
      else false
    }
    loop(ls, 0)
  }
}
