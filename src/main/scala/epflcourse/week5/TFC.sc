package week4

import sun.security.util.Length

object TFC {
	var myList = List(1,2,3,4,5,6)            //> myList  : List[Int] = List(1, 2, 3, 4, 5, 6)
	
	def squareList(xs: List[Int]) : List[Int] = xs match{
	  case Nil => Nil
	  case x :: ys => x*x :: squareList(ys)
	}                                         //> squareList: (xs: List[Int])List[Int]
	
	var myListSquared = squareList(myList)    //> myListSquared  : List[Int] = List(1, 4, 9, 16, 25, 36)
	
	def mapSquare(xs: List[Int]) : List[Int] = xs.map( that => that * that)
                                                  //> mapSquare: (xs: List[Int])List[Int]
	
	mapSquare(myListSquared)                  //> res0: List[Int] = List(1, 16, 81, 256, 625, 1296)
	
	myList.map(x => x*x*x)                    //> res1: List[Int] = List(1, 8, 27, 64, 125, 216)
	
	val myStringsToPack = List("a","a","b","c","c","a")
                                                  //> myStringsToPack  : List[String] = List(a, a, b, c, c, a)
	
	def pack[T](xs:List[T]) : List[List[T]] = xs match{
		case Nil => Nil
		case x :: ys =>
					val (first, rest) = xs.span( y => y == x )
					first :: pack(rest)
	}                                         //> pack: [T](xs: List[T])List[List[T]]
	pack(myStringsToPack)                     //> res2: List[List[String]] = List(List(a, a), List(b), List(c, c), List(a))

	def packRunLength[T](xs:List[T]) : List[(T, Int)] = pack(xs).map(x => (x.head, x.size))
                                                  //> packRunLength: [T](xs: List[T])List[(T, Int)]
	packRunLength(myStringsToPack)            //> res3: List[(String, Int)] = List((a,2), (b,1), (c,2), (a,1))

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}