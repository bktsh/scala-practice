package week6

object combinators {
	
	def isPrime(x:Int) : Boolean =  (2 until x).forall(d => x %d != 0)
                                                  //> isPrime: (x: Int)Boolean
	
	val n = 7                                 //> n  : Int = 7
	
	(1 until n).map( i =>
		(1 until i).map(j => (i,j))).flatten
                                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))
 
 (1 until n).flatMap( i =>
		(1 until i).map(j => (i,j))).filter(pair =>
			isPrime(pair._1+pair._2)) //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

	for{
		i <- 1 until n
		j <- 1 until i
		if isPrime(i+j)
	} yield (i,j)                             //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
	
	def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double = {
		(for( (x,y) <- xs.zip(ys)) yield x*y).sum
  }                                               //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
	
	val doubles = Vector(1.0,2.0,3.0,4.0,5.0) //> doubles  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0,
                                                  //|  4.0, 5.0)
	scalarProduct(doubles, doubles)           //> res3: Double = 55.0
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}