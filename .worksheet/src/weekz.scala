import week3.model._

object weekz {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(258); 
  
    def getNthElement[T]( n: Int,  list : List[T]) : T = {
    	if(list.isEmpty) throw new IndexOutOfBoundsException("INDEX OUT OF BOUND")
    	if (n == 0) return list.head
    	else getNthElement(n-1, list.tail)
    };System.out.println("""getNthElement: [T](n: Int, list: week3.model.List[T])T""");$skip(71); 

		val list = new Cons[Int](2, new Cons[Int](1,new Cons[Int](2, Nil)));System.out.println("""list  : week3.model.Cons[Int] = """ + $show(list ));$skip(27); val res$0 = 
    getNthElement(1, list);System.out.println("""res0: Int = """ + $show(res$0));$skip(27); val res$1 = 
    getNthElement(2, list);System.out.println("""res1: Int = """ + $show(res$1));$skip(46); 
    
    val temp:List[Int] = List.apply(1,2);System.out.println("""temp  : week3.model.List[Int] = """ + $show(temp ));$skip(27); val res$2 = 
    getNthElement(1, temp);System.out.println("""res2: Int = """ + $show(res$2));$skip(58); 
    
    val covariantAny : Array[Any] = Array[Any](null);System.out.println("""covariantAny  : Array[Any] = """ + $show(covariantAny ));$skip(52); 
    val covariantInt : Array[Int] = Array[Int](1,2);System.out.println("""covariantInt  : Array[Int] = """ + $show(covariantInt ));$skip(71); 
    def fact(n: Int) : Int = {
    	if(n==0) 1 else n* fact(n-1)
    };System.out.println("""fact: (n: Int)Int""");$skip(12); val res$3 = 
    fact(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(170); 
    
    def tailRecursiveFact(n: Int):Int = {
    	def loop(acc: Int, n: Int):Int = {
    			if( n == 0 ) acc
    			else loop(acc * n, n-1)
    	}
    	loop(1,n)
    };System.out.println("""tailRecursiveFact: (n: Int)Int""");$skip(23); val res$4 = 
		tailRecursiveFact(5);System.out.println("""res4: Int = """ + $show(res$4));$skip(135); 
		
		val products = scala.collection.immutable.List(("CocaCola", 1.35f), ("IcedTea", 1.40f), ("Dr.Pepper", 1.25f), ("Mt. Due", 1.49f));System.out.println("""products  : List[(String, Float)] = """ + $show(products ));$skip(43); 
    val menue = products.sortBy(t => t._1);System.out.println("""menue  : List[(String, Float)] = """ + $show(menue ))}
}
