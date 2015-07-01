package week4

object lists {
   	
   	val fruit = List("Apple","Orange","Strawberry")
                                                  //> fruit  : List[String] = List(Apple, Orange, Strawberry)
 		val odds = 1 :: 3 :: 5 ::  7:: Nil//> odds  : List[Int] = List(1, 3, 5, 7)
 		val empty = Nil                   //> empty  : scala.collection.immutable.Nil.type = List()
 		println(fruit + " - " + fruit.isEmpty + " - " + fruit.head + " - " + fruit.tail  )
                                                  //> List(Apple, Orange, Strawberry) - false - Apple - List(Orange, Strawberry)
 		println(List("Orange":: fruit))   //> List(List(Orange, Apple, Orange, Strawberry))
 		
 		println(odds + " - " + odds.isEmpty + " - " + odds.head + " - " + odds.tail  )
                                                  //> List(1, 3, 5, 7) - false - 1 - List(3, 5, 7)
 		println(empty + " - " + empty.isEmpty)
                                                  //> List() - true
	def insersionSort(xs: List[Int]) : List[Int] = xs match{
		case List() => List()
		case y::ys => insert(y,insersionSort(ys))
	}                                         //> insersionSort: (xs: List[Int])List[Int]

	def insert(x: Int, xs: List[Int]) : List[Int] = xs match{
			case List()  => List(x)
			case y :: ys => if(x <= y) x :: xs else y :: insert(x , ys)
	}                                         //> insert: (x: Int, xs: List[Int])List[Int]
	
	val ints = 9 :: 4 :: 3 :: 60 :: 55 :: Nil //> ints  : List[Int] = List(9, 4, 3, 60, 55)
	print(ints)                               //> List(9, 4, 3, 60, 55)
	print(ints.size)                          //> 5
	val sorted = insersionSort(ints)          //> sorted  : List[Int] = List(3, 4, 9, 55, 60)
	print("Test")                             //> Test
	print(sorted.size)                        //> 5
	print("Test")                             //> Test
	print("Test")                             //> Test
	print(ints.head)                          //> 9
	print(ints.init)                          //> List(9, 4, 3, 60)
	print(ints.tail)                          //> List(4, 3, 60, 55)
	print(ints.take(2))                       //> List(9, 4)
	print(ints.drop(2))                       //> List(3, 60, 55)
	print(ints.last)                          //> 55
	print(ints.apply(3))                      //> 60
	print(ints.length)                        //> 5
	val all = ints ++ sorted                  //> all  : List[Int] = List(9, 4, 3, 60, 55, 3, 4, 9, 55, 60)
	sorted.reverse                            //> res0: List[Int] = List(60, 55, 9, 4, 3)
	sorted.updated(2, 10)                     //> res1: List[Int] = List(3, 4, 10, 55, 60)
	sorted.indexOf(10)                        //> res2: Int = -1
	all.contains(10)                          //> res3: Boolean = false
	print(all.length)                         //> 10
	
	def init(xs : List[Int]) : List[Int] = xs match{
		case List()  => throw new Error("init of empty list")
		case List(x) => List()
		case y :: ys => y::init(ys)
	}                                         //> init: (xs: List[Int])List[Int]
	print(ints ::: all)                       //> List(9, 4, 3, 60, 55, 9, 4, 3, 60, 55, 3, 4, 9, 55, 60)
	init(ints)                                //> res4: List[Int] = List(9, 4, 3, 60)
	init(all)                                 //> res5: List[Int] = List(9, 4, 3, 60, 55, 3, 4, 9, 55)
	
	
	def removeAt(index: Int, xs : List[Int]) : List[Int] = (xs take index-1):::(xs drop index)
                                                  //> removeAt: (index: Int, xs: List[Int])List[Int]
	removeAt(3,ints)                          //> res6: List[Int] = List(9, 4, 60, 55)
	removeAt(4,ints)                          //> res7: List[Int] = List(9, 4, 3, 55)
	
	val pair = ("Pair",2)                     //> pair  : (String, Int) = (Pair,2)
	val pairN = ("Quadriple",2, 5.50, new java.util.Date())
                                                  //> pairN  : (String, Int, Double, java.util.Date) = (Quadriple,2,5.5,Tue Jun 0
                                                  //| 9 23:23:47 EDT 2015)
}