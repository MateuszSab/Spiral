import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Spiral._

class SpiralSpec extends AnyFlatSpec with should.Matchers {

  it should "return list of indexes of a 3X3 Array in a spiral wise order" in {


    SpiralIndex(3) shouldBe List((0, 0), (0, 1), (0, 2), (1, 2), (2, 2), (2, 1), (2, 0), (1, 0), (1, 1))

  }

  it should "return 3x3 array with numbers in a spiral order " in {

    val arr = Array.ofDim[Int](3, 3)
    val x = SpiralIndex(3)

    for {
      a <- x.indices
    } yield {
      arr(x(a)._1)(x(a)._2) = a
    }
    arr shouldBe Array(
      Array(0, 1, 2),
      Array(7, 8, 3),
      Array(6, 5, 4))
  }

  it should "return 9x9 array with numbers in a spiral order " in {

    val arr = Array.ofDim[Int](9, 9)
    val x = SpiralIndex(9)

    for {
      a <- x.indices
    } yield {
      arr(x(a)._1)(x(a)._2) = a
    }
    arr shouldBe Array(
      Array(0, 1, 2, 3, 4, 5, 6, 7, 8),
      Array(31, 32, 33, 34, 35, 36, 37, 38, 9),
      Array(30, 55, 56, 57, 58, 59, 60, 39, 10),
      Array(29, 54, 71, 72, 73, 74, 61, 40, 11),
      Array(28, 53, 70, 79, 80, 75, 62, 41, 12),
      Array(27, 52, 69, 78, 77, 76, 63, 42, 13),
      Array(26, 51, 68, 67, 66, 65, 64, 43, 14),
      Array(25, 50, 49, 48, 47, 46, 45, 44, 15),
      Array(24, 23, 22, 21, 20, 19, 18, 17, 16))

  }


}

