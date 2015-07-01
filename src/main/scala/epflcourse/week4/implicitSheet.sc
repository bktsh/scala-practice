package week4
import math.Ordering

object implicitSheet {
	val ints = 9 :: 4 :: 3 :: 60 :: 55 :: 2:: Nil
                                                  //> ints  : List[Int] = List(9, 4, 3, 60, 55, 2)

  def mergeSort[T](xs : List[T]) (lt:(T,T) => Boolean) : List[T] = {
		val n = xs.length / 2
		if(n==0) xs
		else{
			def merge(x:List[T], y:List[T]) : List[T] = (x, y) match{
				case (Nil, ys) => ys
				case (xs, Nil) => xs
				case (xe::xl,ye::yl) => if (lt(xe , ye)) xe :: merge(xl, y)
														  else ye :: merge(x, yl)
				
			}
			val(fst, snd) = xs.splitAt(n)
			merge(mergeSort(fst)(lt), mergeSort(snd)(lt))
		}
	}                                         //> mergeSort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]
	
	mergeSort(ints)((x,y) => x < y)           //> res0: List[Int] = List(2, 3, 4, 9, 55, 60)

  def mergeSortWithOrdering[T](xs : List[T]) (order: Ordering[T]) : List[T] = {
		val n = xs.length / 2
		if(n==0) xs
		else{
			def merge(x:List[T], y:List[T]) : List[T] = (x, y) match{
				case (Nil, ys) => ys
				case (xs, Nil) => xs
				case (xe::xl,ye::yl) => if (order.lt(xe , ye)) xe :: merge(xl, y)
														  else ye :: merge(x, yl)
				
			}
			val(fst, snd) = xs.splitAt(n)
			merge(mergeSortWithOrdering(fst)(order), mergeSortWithOrdering(snd)(order))
		}
	}                                         //> mergeSortWithOrdering: [T](xs: List[T])(order: scala.math.Ordering[T])List[
                                                  //| T]
  mergeSortWithOrdering(ints)(Ordering.Int)       //> res1: List[Int] = List(2, 3, 4, 9, 55, 60)
  
  
  def mergeSortWithImplicitOrdering[T](xs : List[T]) (implicit order: Ordering[T]) : List[T] = {
		val n = xs.length / 2
		if(n==0) xs
		else{
			def merge(x:List[T], y:List[T]) : List[T] = (x, y) match{
				case (Nil, ys) => ys
				case (xs, Nil) => xs
				case (xe::xl,ye::yl) => if (order.lt(xe , ye)) xe :: merge(xl, y)
														  else ye :: merge(x, yl)
				
			}
			val(fst, snd) = xs.splitAt(n)
			merge(mergeSortWithImplicitOrdering(fst), mergeSortWithImplicitOrdering(snd))
		}
	}                                         //> mergeSortWithImplicitOrdering: [T](xs: List[T])(implicit order: scala.math.
                                                  //| Ordering[T])List[T]
  mergeSortWithOrdering(ints)(Ordering.Int)       //> res2: List[Int] = List(2, 3, 4, 9, 55, 60)
                                   
}