import Main.accum
import org.scalatest._
import flatspec._
import matchers._


class MainSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An accum"

  it should "return string with specific pattern " in {
    accum("abcd") shouldBe "A-Bb-Ccc-Dddd"
  }

}