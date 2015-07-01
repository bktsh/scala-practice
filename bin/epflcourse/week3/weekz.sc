import week3.model._

object weekz {
  
    def getNthElement[T]( n: Int,  list : List[T]) : T = {
    	if(list.isEmpty) throw new IndexOutOfBoundsException("INDEX OUT OF BOUND")
    	if (n == 0) return list.head
    	else getNthElement(n-1, list.tail)
    }                                             //> getNthElement: [T](n: Int, list: week3.model.List[T])T

		val list = new Cons[Int](2, new Cons[Int](1,new Cons[Int](2, Nil)))
                                                  //> list  : week3.model.Cons[Int] = week3.model.Cons@3b6eb2ec
    getNthElement(1, list)                        //> res0: Int = 1
    getNthElement(2, list)                        //> res1: Int = 2
    
    val temp:List[Int] = List.apply(1,2)          //> temp  : week3.model.List[Int] = week3.model.Cons@1e643faf
    getNthElement(1, temp)                        //> res2: Int = 2
    
    val covariantAny : Array[Any] = Array[Any](null)
                                                  //> covariantAny  : Array[Any] = Array(null)
    val covariantInt : Array[Int] = Array[Int](1,2)
                                                  //> covariantInt  : Array[Int] = Array(1, 2)
    def fact(n: Int) : Int = {
    	if(n==0) 1 else n* fact(n-1)
    }                                             //> fact: (n: Int)Int
    fact(5)                                       //> res3: Int = 120
    
    def tailRecursiveFact(n: Int):Int = {
    	def loop(acc: Int, n: Int):Int = {
    			if( n == 0 ) acc
    			else loop(acc * n, n-1)
    	}
    	loop(1,n)
    }                                             //> tailRecursiveFact: (n: Int)Int
		tailRecursiveFact(5)              //> res4: Int = 120
}