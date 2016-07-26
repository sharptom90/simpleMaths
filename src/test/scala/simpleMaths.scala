/**
  * Created by sharpt on 26/07/2016.
  */
import org.scalatest.{FunSuite, Matchers}

class simpleMaths {

  def sumOfNumbers(inputNumbers : List[Int]): Int = {
    if (inputNumbers.isEmpty) return 0
    inputNumbers.head + sumOfNumbers(inputNumbers.tail)
  }

}

/*Added a comment*/

class simpleMathsSpec extends FunSuite with Matchers{

  val result = new simpleMaths

  test("sum of an empty list should be zero") {
    result.sumOfNumbers(Nil) shouldBe 0
  }
  test("sum of a list with three variables should calculate the correct total") {
    result.sumOfNumbers(List(0, 1, 2)) shouldBe 3
  }
}
