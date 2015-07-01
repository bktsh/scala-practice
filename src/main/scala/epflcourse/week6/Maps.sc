package week6

import sun.security.util.Length

object Maps {
	
	val charMap = Map('A' -> 1, 'B' -> 2, 'C' -> 3)
                                                  //> charMap  : scala.collection.immutable.Map[Char,Int] = Map(A -> 1, B -> 2, C 
                                                  //| -> 3)
	val capitalOfCountry = Map("USA" -> "D.C", "Canada" -> "Toronto").withDefaultValue("<<Unknown>>")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(USA 
                                                  //| -> D.C, Canada -> Toronto)
  capitalOfCountry("USA")                         //> res0: String = D.C
  capitalOfCountry.get("USA")                     //> res1: Option[String] = Some(D.C)
  capitalOfCountry.get("Iran")                    //> res2: Option[String] = None
  capitalOfCountry("Iran")                        //> res3: String = <<Unknown>>
	
	val fruits = List("Pearl","Apple","Orange","Cucumber","Pineapple")
                                                  //> fruits  : List[String] = List(Pearl, Apple, Orange, Cucumber, Pineapple)
	fruits.sortWith( _.length > _.length)     //> res4: List[String] = List(Pineapple, Cucumber, Orange, Pearl, Apple)
	fruits.sortWith( _.length < _.length)     //> res5: List[String] = List(Pearl, Apple, Orange, Cucumber, Pineapple)
	fruits.sorted                             //> res6: List[String] = List(Apple, Cucumber, Orange, Pearl, Pineapple)
	fruits.groupBy { _.head }                 //> res7: scala.collection.immutable.Map[Char,List[String]] = Map(P -> List(Pear
                                                  //| l, Pineapple), A -> List(Apple), C -> List(Cucumber), O -> List(Orange))
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}