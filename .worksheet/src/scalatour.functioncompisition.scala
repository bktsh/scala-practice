package scalatour

object functioncompisition {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
 	def f(s: String) = "f(" + s + ")";System.out.println("""f: (s: String)String""");$skip(36); 
 	def g(s: String) = "g(" + s + ")";System.out.println("""g: (s: String)String""");$skip(17); val res$0 = 
 	
 	f("Hashem");System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
 	g("Hashem");System.out.println("""res1: String = """ + $show(res$1));$skip(37); 
 	
 	val fComposeg = f _ compose g _;System.out.println("""fComposeg  : String => String = """ + $show(fComposeg ));$skip(25); val res$2 = 
 	
 	fComposeg("Hashem");System.out.println("""res2: String = """ + $show(res$2));$skip(37); 
 	
 	val fAndThenG = f _ andThen g _;System.out.println("""fAndThenG  : String => String = """ + $show(fAndThenG ));$skip(22); val res$3 = 
 	fAndThenG("Hashem");System.out.println("""res3: String = """ + $show(res$3));$skip(65); 
 	
 	val one: PartialFunction[Int, String] = { case 1 => "one" };System.out.println("""one  : PartialFunction[Int,String] = """ + $show(one ));$skip(62); 
 	val two: PartialFunction[Int, String] = { case 2 => "two" };System.out.println("""two  : PartialFunction[Int,String] = """ + $show(two ));$skip(66); 
 	val three: PartialFunction[Int, String] = { case 3 => "three" };System.out.println("""three  : PartialFunction[Int,String] = """ + $show(three ));$skip(78); 
 	val wildcard: PartialFunction[Int, String] = { case _ => "SOMETHING ELSE" };System.out.println("""wildcard  : PartialFunction[Int,String] = """ + $show(wildcard ));$skip(62); 
 	
 	val option = one orElse two orElse three orElse wildcard;System.out.println("""option  : PartialFunction[Int,String] = """ + $show(option ));$skip(12); val res$4 = 
 	option(1);System.out.println("""res4: String = """ + $show(res$4));$skip(12); val res$5 = 
 	option(2);System.out.println("""res5: String = """ + $show(res$5));$skip(13); val res$6 = 
 	option(10);System.out.println("""res6: String = """ + $show(res$6));$skip(12); val res$7 = 
 	option(3)
 	
 	case class PhoneExt(name: String, ext: Int);System.out.println("""res7: String = """ + $show(res$7));$skip(121); 
 	val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200));System.out.println("""extensions  : List[scalatour.functioncompisition.PhoneExt] = """ + $show(extensions ));$skip(74); val res$8 = 
 	extensions.filter { case PhoneExt(name, extension) => extension < 200 };System.out.println("""res8: List[scalatour.functioncompisition.PhoneExt] = """ + $show(res$8));$skip(44); 
  println("Welcome to the Scala worksheet")}
}
