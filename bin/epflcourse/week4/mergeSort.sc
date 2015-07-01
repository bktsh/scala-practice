package week4

object mergeSort {
	val ints = 9 :: 4 :: 3 :: 60 :: 55 :: 2:: Nil
                                                  //> ints  : List[Int] = List(9, 4, 3, 60, 55, 2)
  def mergeSort(xs:List[Int]):List[Int] = {
		val n = xs.length / 2
		if(n==0) xs
		else{
			def merge(x:List[Int], y:List[Int]) : List[Int] = (x, y) match{
				case (Nil, ys) => ys
				case (xs, Nil) => xs
				case (xe::xl,ye::yl) => if (xe < ye) xe :: merge(xl, y)
														  else ye :: merge(x, yl)
				
			}
			val(fst, snd) = xs.splitAt(n)
			merge(mergeSort(fst), mergeSort(snd))
		}
	}                                         //> mergeSort: (xs: List[Int])List[Int]
	
	mergeSort(ints)                           //> res0: List[Int] = List(2, 3, 4, 9, 55, 60)
  
}