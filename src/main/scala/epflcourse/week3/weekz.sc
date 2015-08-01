import week3.model._

object weekz {
  
    def getNthElement[T]( n: Int,  list : List[T]) : T = {
    	if(list.isEmpty) throw new IndexOutOfBoundsException("INDEX OUT OF BOUND")
    	if (n == 0) return list.head
    	else getNthElement(n-1, list.tail)
    }                                             //> getNthElement: [T](n: Int, list: week3.model.List[T])T

		val list = new Cons[Int](2, new Cons[Int](1,new Cons[Int](2, Nil)))
                                                  //> list  : week3.model.Cons[Int] = week3.model.Cons@34ce8af7
    getNthElement(1, list)                        //> res0: Int = 1
    getNthElement(2, list)                        //> res1: Int = 2
    
    val temp:List[Int] = List.apply(1,2)          //> temp  : week3.model.List[Int] = week3.model.Cons@b684286
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
		
		val products = scala.collection.immutable.List(("CocaCola", 1.35f), ("IcedTea", 1.40f), ("Dr.Pepper", 1.25f), ("Mt. Due", 1.49f))
                                                  //> products  : List[(String, Float)] = List((CocaCola,1.35), (IcedTea,1.4), (Dr
                                                  //| .Pepper,1.25), (Mt. Due,1.49))
    val menue = products.sortBy(t => t._1)        //> menue  : List[(String, Float)] = List((CocaCola,1.35), (Dr.Pepper,1.25), (I
                                                  //| cedTea,1.4), (Mt. Due,1.49))
}