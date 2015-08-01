package tour

import org.specs2.mutable._

object TestSpec2{

class FactorialSpec extends Specification {
  args.report(color = true)

  def factorial(n: Int) = (1 to n).reduce(_ * _)

  "The 'Hello world' string" should {
    "factorial 3 must be 6" in {
      factorial(3) mustEqual 6
    }
    "factorial 4 must greaterThan 6" in {
      factorial(4) must greaterThan(6)
    }
  }
}
specs2.run(new FactorialSpec)
 
println("Welcome to the Scala worksheet")
}