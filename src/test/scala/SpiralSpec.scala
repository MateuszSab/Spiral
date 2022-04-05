import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SpiralSpec extends AnyFlatSpec with should.Matchers {

  it should "return given spiral seq of indices" in {

    import Spiral._

    val arr = Array.ofDim[Int](3, 3)

    SpiralIndex(arr) shouldBe List((0, 0), (0, 1), (0, 2), (1, 2), (2, 2), (2, 1), (2, 0), (1, 0), (1, 1))

  }

  it should "return given spiral table" in {

    import Spiral._

    val arr = Array.ofDim[Int](3, 3)

    val x = SpiralIndex(arr)

    for {
      a <- x.indices
      //    b <- 1 to  x.indices
    } yield {
      arr(x(a)._1)(x(a)._2) = a
    }
    arr shouldBe Array(Array(0, 1, 2), Array(7, 8, 3), Array(6, 5, 4))
  }
}

