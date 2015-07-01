package week7

object streams {

	val stream1 = Stream.cons(1,Stream.cons(2, Stream.empty))
                                                  //> stream1  : Stream.Cons[Int] = Stream(1, ?)
	
	val stream2 = Stream(1,2,3)               //> stream2  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	val anotherStream = (1 to 1000).toStream  //> anotherStream  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	anotherStream.tail                        //> res0: scala.collection.immutable.Stream[Int] = Stream(2, ?)
	
	1988 #:: anotherStream                    //> res1: scala.collection.immutable.Stream[Int] = Stream(1988, ?)
	
	(1 to 10).toStream.take(3).toList         //> res2: List[Int] = List(1, 2, 3)
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}