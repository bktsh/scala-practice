package week4

object Filters {
  val ints = List(-1,5,-9,10,0,70,140,-48)        //> ints  : List[Int] = List(-1, 5, -9, 10, 0, 70, 140, -48)
  ints.filter { x => x >= 0 }                     //> res0: List[Int] = List(5, 10, 0, 70, 140)
  ints.filterNot { x => x > 0 }                   //> res1: List[Int] = List(-1, -9, 0, -48)
  ints.partition { x => x >= 0 }                  //> res2: (List[Int], List[Int]) = (List(5, 10, 0, 70, 140),List(-1, -9, -48))
  
  ints.takeWhile { x => x < 0 }                   //> res3: List[Int] = List(-1)
  ints.dropWhile { x => x < 0 }                   //> res4: List[Int] = List(5, -9, 10, 0, 70, 140, -48)
  ints.span { x => x < 0 }                        //> res5: (List[Int], List[Int]) = (List(-1),List(5, -9, 10, 0, 70, 140, -48))
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}