package week3.model

trait List[+T] {
  def isEmpty : Boolean  
  def head : T
  def tail : List[T]
  def prepend[U >: T](element:U) : List[U] = new Cons(element, this)
}


class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty : Boolean = false
}

object Nil extends List[Nothing] {
  def isEmpty : Boolean = true
  def head : Nothing = throw new NoSuchElementException("Nil.Head")
  def tail : Nothing = throw new NoSuchElementException("Nil.Tail")
}

object List {
  //List(1,2) = list.apply(1,2)
  def apply[T]() = Nil
  def apply[T](x1:T, x2:T):List[T] = new Cons[T](x1, new Cons[T](x2, Nil))
}