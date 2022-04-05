import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SpiralSpec extends AnyFlatSpec with should.Matchers{

  it should "return given spiral table" in {

    import Spiral._

    val arr = Array.ofDim[Int](3, 3)

    SpiralIndex(arr) shouldBe List((0,0), (0,1), (0,2), (1,2), (2,2), (2,1), (2,0), (1,0), (1,1))

  }

}
