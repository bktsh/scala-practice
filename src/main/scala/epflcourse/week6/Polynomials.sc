package week6

import scala.collection.immutable.Map.WithDefault

object Polynomials {

	class Poly(val terms0 : Map[Int, Double]) {
		def this(bindings : (Int, Double)*) = this(bindings.toMap)
		val terms = terms0.withDefaultValue(0.0)
/*
		//1. add ploynomials using ++ on Maps
		def +(other: Poly) = new Poly(terms ++ other.terms.map( x => adjust(x)))
		//2.using map without default values
		def adjust(term : (Int, Double)) : (Int, Double) = {
			val (exp, coef) = term
 		  exp -> (coef+ terms(exp))
			terms.get(exp) match{
				case Some(coef1) => exp -> (coef+ coef1)
				case None => exp -> coef
			}
		}
*/
		
		//2. using leftFold
		def +(other:Poly) = new Poly((other.terms.foldLeft(terms))(addTerm))
		def addTerm(terms:Map[Int,Double], term:(Int,Double)):Map[Int,Double] = {
				val (exp, coef) = term
				terms + (exp -> (coef+ terms(exp)))
		}
		//1.using withDefaultValue
		def adjust(term : (Int, Double)) : (Int, Double) = {
			val (exp, coef) = term
 		  exp -> (coef+ terms(exp))
		}
		override def toString =
		(for ((exp,coef) <- terms.toList.sorted.reverse ) yield coef+"x^"+exp) mkString "+"
	}

	val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2)
                                                  //> p1  : week6.Polynomials.Poly = 6.2x^5+4.0x^3+2.0x^1
	val p2 =  new Poly(0 -> 3.0, 3 -> 7.0)    //> p2  : week6.Polynomials.Poly = 7.0x^3+3.0x^0
	p1 + p2                                   //> res0: week6.Polynomials.Poly = 6.2x^5+11.0x^3+2.0x^1+3.0x^0
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}