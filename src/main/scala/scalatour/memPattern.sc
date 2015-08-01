package tour

import scala.collection.mutable.WeakHashMap

object MemoryPattern {

val cache = new WeakHashMap[Int, Int]             //> cache  : scala.collection.mutable.WeakHashMap[Int,Int] = Map()
def memo(f: Int => Int) = (x: Int) => cache.getOrElseUpdate(x, f(x))
                                                  //> memo: (f: Int => Int)Int => Int

def fibonacci_(in: Int): Int = in match {
  case 0 => 0;
  case 1 => 1;
  case n: Int => memo(fibonacci_)(n - 1) + memo(fibonacci_)(n - 2)
  					//fibonacci_(n - 1) + fibonacci_(n - 2)
}                                                 //> fibonacci_ : (in: Int)Int
val fibonacci: Int => Int = memo(fibonacci_)      //> fibonacci  : Int => Int = <function1>

val t1 = System.currentTimeMillis()               //> t1  : Long = 1436151114068
println(fibonacci(40))                            //> 102334155
println("it takes " + (System.currentTimeMillis() - t1) + "ms")
                                                  //> it takes 4ms

val t2 = System.currentTimeMillis()               //> t2  : Long = 1436151114072
println(fibonacci(40))                            //> 102334155
println("it takes " + (System.currentTimeMillis() - t2) + "ms")
                                                  //> it takes 1ms
 
    
println("Welcome to the Scala worksheet")         //> Welcome to the Scala worksheet
}