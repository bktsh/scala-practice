package week6

object sets {

	val fruits = Set("apple","pearl","grape") //> fruits  : scala.collection.immutable.Set[String] = Set(apple, pearl, grape)
	
	val ints =(1 to 10).toSet                 //> ints  : scala.collection.immutable.Set[Int] = Set(5, 10, 1, 6, 9, 2, 7, 3, 8
                                                  //| , 4)
	
	ints.map(_ * 2 )                          //> res0: scala.collection.immutable.Set[Int] = Set(10, 14, 20, 6, 2, 12, 18, 16
                                                  //| , 8, 4)
  fruits.filter { x => x.startsWith("app") }      //> res1: scala.collection.immutable.Set[String] = Set(apple)

  def nQueens(n: Int) : Set[List[Int]] = {
  	def placeQueens(k:Int) : Set[List[Int]] = {
  		if( k == 0 ) Set(List())
  		else
  			for{
  				queens <- placeQueens(k-1)
  			  col <- 0 until n
  			  if(isSafe(col, queens))
  			}yield col :: queens
  	}
  	placeQueens(n)
  }                                               //> nQueens: (n: Int)Set[List[Int]]
  
  def isSafe(col:Int, queens:List[Int]):Boolean = {
  	val row = queens.length
  	val queensWithRows = (row-1 to 0 by -1).zip(queens)
  	queensWithRows.forall{
  		case (r,c) => col != c && math.abs(col -c ) != row -r
  	}
  }                                               //> isSafe: (col: Int, queens: List[Int])Boolean
  
  def show(queens:List[Int]) = {
  	val lines =
  	for( col <- queens.reverse)
  	yield Vector.fill(queens.length)("* ").updated(col,"X ").mkString
  	"\n" + (lines mkString "\n" )
  }                                               //> show: (queens: List[Int])String
  
	(nQueens(8) take 3 map show) mkString "\n"//> res2: String = "
                                                  //| * * * * * X * * 
                                                  //| * * * X * * * * 
                                                  //| * X * * * * * * 
                                                  //| * * * * * * * X 
                                                  //| * * * * X * * * 
                                                  //| * * * * * * X * 
                                                  //| X * * * * * * * 
                                                  //| * * X * * * * * 
                                                  //| 
                                                  //| * * * * X * * * 
                                                  //| * * * * * * X * 
                                                  //| * X * * * * * * 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * * X 
                                                  //| X * * * * * * * 
                                                  //| * * X * * * * * 
                                                  //| * * * * * X * * 
                                                  //| 
                                                  //| * * * * * X * * 
                                                  //| * * X * * * * * 
                                                  //| * * * * * * X * 
                                                  //| * * * X * * * * 
                                                  //| X * * * * * * * 
                                                  //| * * * * * * * X 
                                                  //| * X * * * * * * 
                                                  //| * * * * X * * * "
  
}