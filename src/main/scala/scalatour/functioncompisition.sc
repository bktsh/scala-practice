package scalatour

object functioncompisition {
 	def f(s: String) = "f(" + s + ")"         //> f: (s: String)String
 	def g(s: String) = "g(" + s + ")"         //> g: (s: String)String
 	
 	f("Hashem")                               //> res0: String = f(Hashem)
 	g("Hashem")                               //> res1: String = g(Hashem)
 	
 	val fComposeg = f _ compose g _           //> fComposeg  : String => String = <function1>
 	
 	fComposeg("Hashem")                       //> res2: String = f(g(Hashem))
 	
 	val fAndThenG = f _ andThen g _           //> fAndThenG  : String => String = <function1>
 	fAndThenG("Hashem")                       //> res3: String = g(f(Hashem))
 	
 	val one: PartialFunction[Int, String] = { case 1 => "one" }
                                                  //> one  : PartialFunction[Int,String] = <function1>
 	val two: PartialFunction[Int, String] = { case 2 => "two" }
                                                  //> two  : PartialFunction[Int,String] = <function1>
 	val three: PartialFunction[Int, String] = { case 3 => "three" }
                                                  //> three  : PartialFunction[Int,String] = <function1>
 	val wildcard: PartialFunction[Int, String] = { case _ => "SOMETHING ELSE" }
                                                  //> wildcard  : PartialFunction[Int,String] = <function1>
 	
 	val option = one orElse two orElse three orElse wildcard
                                                  //> option  : PartialFunction[Int,String] = <function1>
 	option(1)                                 //> res4: String = one
 	option(2)                                 //> res5: String = two
 	option(10)                                //> res6: String = SOMETHING ELSE
 	option(3)                                 //> res7: String = three
 	
 	case class PhoneExt(name: String, ext: Int)
 	val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))
                                                  //> extensions  : List[scalatour.functioncompisition.PhoneExt] = List(PhoneExt(s
                                                  //| teve,100), PhoneExt(robey,200))
 	extensions.filter { case PhoneExt(name, extension) => extension < 200 }
                                                  //> res8: List[scalatour.functioncompisition.PhoneExt] = List(PhoneExt(steve,100
                                                  //| ))
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}