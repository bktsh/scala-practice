package week4

object Vectors {

	val ints = Vector(1,2,3,4,5)              //> ints  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)
	val people = Vector("Hashem","Baktash","John","Smith")
                                                  //> people  : scala.collection.immutable.Vector[String] = Vector(Hashem, Baktash
                                                  //| , John, Smith)
	
	"Jack" +: people                          //> res0: scala.collection.immutable.Vector[String] = Vector(Jack, Hashem, Bakta
                                                  //| sh, John, Smith)
  people :+ "George"                              //> res1: scala.collection.immutable.Vector[String] = Vector(Hashem, Baktash, Jo
                                                  //| hn, Smith, George)
	val arrayOfInts = Array(1,2,3,4,5)        //> arrayOfInts  : Array[Int] = Array(1, 2, 3, 4, 5)
	arrayOfInts.map(x => x*x)                 //> res2: Array[Int] = Array(1, 4, 9, 16, 25)
	
	val str = "Hashem Baktash"                //> str  : String = Hashem Baktash
	str.filter { x => x.isUpper }             //> res3: String = HB
	
	val rangeInclusive  = 1 to 10             //> rangeInclusive  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3
                                                  //| , 4, 5, 6, 7, 8, 9, 10)
	val rangeExclusive  = 1 until 10          //> rangeExclusive  : scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6,
                                                  //|  7, 8, 9)
	1 to 10 by 2                              //> res4: scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
	6 to 1 by -2                              //> res5: scala.collection.immutable.Range = Range(6, 4, 2)
	
	str.exists { x => x.isUpper }             //> res6: Boolean = true
	arrayOfInts.forall { x => x > 0 }         //> res7: Boolean = true
	
	val pairs = List(1,2,3,4).zip(str)        //> pairs  : List[(Int, Char)] = List((1,H), (2,a), (3,s), (4,h))
	pairs.unzip                               //> res8: (List[Int], List[Char]) = (List(1, 2, 3, 4),List(H, a, s, h))
	
	str.flatMap { x => List('.',x) }          //> res9: String = .H.a.s.h.e.m. .B.a.k.t.a.s.h
	
	arrayOfInts.sum                           //> res10: Int = 15
	arrayOfInts.product                       //> res11: Int = 120
	arrayOfInts.max                           //> res12: Int = 5
	arrayOfInts.min                           //> res13: Int = 1
	arrayOfInts.forall(x => 2 > x)            //> res14: Boolean = false
	
	
	def isPrime(x:Int) : Boolean =  (2 until x).forall(d => x %d != 0)
                                                  //> isPrime: (x: Int)Boolean
	isPrime(97)                               //> res15: Boolean = true
	isPrime(108)                              //> res16: Boolean = false
	
	def combine(xs:List[Int],ys:List[Int]):List[(Int,Int)] = {
		xs.zip(ys)
	}                                         //> combine: (xs: List[Int], ys: List[Int])List[(Int, Int)]
	
	combine(List(1,2),List(3,4))              //> res17: List[(Int, Int)] = List((1,3), (2,4))
	
	(1 to 2).flatMap(x => (3 to 4).map(y => List((x,y))))
                                                  //> res18: scala.collection.immutable.IndexedSeq[List[(Int, Int)]] = Vector(List
                                                  //| ((1,3)), List((1,4)), List((2,3)), List((2,4)))
  def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double = {
  	xs.zip(ys).map(xy => (xy._1 * xy._2)).sum
  }                                               //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
 
 	val doubles = Vector(1.0,2.0,3.0,4.0,5.0) //> doubles  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0
                                                  //| , 4.0, 5.0)
   
  scalarProduct(doubles, doubles)                 //> res19: Double = 55.0
   
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}