package tour

import scala.collection.mutable.WeakHashMap

object MemoryPattern {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(120); 

val cache = new WeakHashMap[Int, Int];System.out.println("""cache  : scala.collection.mutable.WeakHashMap[Int,Int] = """ + $show(cache ));$skip(69); 
def memo(f: Int => Int) = (x: Int) => cache.getOrElseUpdate(x, f(x));System.out.println("""memo: (f: Int => Int)Int => Int""");$skip(189); 

def fibonacci_(in: Int): Int = in match {
  case 0 => 0;
  case 1 => 1;
  case n: Int => memo(fibonacci_)(n - 1) + memo(fibonacci_)(n - 2)
  					//fibonacci_(n - 1) + fibonacci_(n - 2)
};System.out.println("""fibonacci_ : (in: Int)Int""");$skip(45); 
val fibonacci: Int => Int = memo(fibonacci_);System.out.println("""fibonacci  : Int => Int = """ + $show(fibonacci ));$skip(37); 

val t1 = System.currentTimeMillis();System.out.println("""t1  : Long = """ + $show(t1 ));$skip(23); 
println(fibonacci(40));$skip(64); 
println("it takes " + (System.currentTimeMillis() - t1) + "ms");$skip(37); 

val t2 = System.currentTimeMillis();System.out.println("""t2  : Long = """ + $show(t2 ));$skip(23); 
println(fibonacci(40));$skip(64); 
println("it takes " + (System.currentTimeMillis() - t2) + "ms");$skip(49); 
 
    
println("Welcome to the Scala worksheet")}
}
