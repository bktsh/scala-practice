package week4

object Fold_Reduce {
	val ints = List(1,2,3,4,5)                //> ints  : List[Int] = List(1, 2, 3, 4, 5)
	val anotherList = List(6,7,8,9,10)        //> anotherList  : List[Int] = List(6, 7, 8, 9, 10)
	ints.reduceLeft((x,y) => x*y)             //> res0: Int = 120
	ints.reduceLeft((x,y) => x+y)             //> res1: Int = 15
	ints.reduceLeft((_+_))                    //> res2: Int = 15
	ints.reduceLeft((_*_))                    //> res3: Int = 120
	ints.foldLeft(0)((_+_))                   //> res4: Int = 15
	ints.foldLeft(1)((_*_))                   //> res5: Int = 120
	ints.foldRight(1)((_*_))                  //> res6: Int = 120
	ints.foldRight(0)((_+_))                  //> res7: Int = 15
	
	ints.foldRight(anotherList)((_ :: _))     //> res8: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	ints ++ anotherList                       //> res9: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	
	ints.reverse                              //> res10: List[Int] = List(5, 4, 3, 2, 1)
	ints.reverse.reverse                      //> res11: List[Int] = List(1, 2, 3, 4, 5)
	ints.reverse_:::(anotherList)             //> res12: List[Int] = List(10, 9, 8, 7, 6, 1, 2, 3, 4, 5)
	
	ints.repr                                 //> res13: List[Int] = List(1, 2, 3, 4, 5)
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}