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
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(415); val res$0 = 
specs2.run(new FactorialSpec);System.out.println("""res0: <error> = """ + $show(res$0));$skip(44); 
 
println("Welcome to the Scala worksheet")}
}
