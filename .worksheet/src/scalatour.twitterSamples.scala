package scalatour

object twitterSamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
	val chars = 'a' to 'z';System.out.println("""chars  : scala.collection.immutable.NumericRange.Inclusive[Char] = """ + $show(chars ));$skip(121); 
	val perms = chars flatMap { a =>
	  chars flatMap { b =>
	    if (a != b) Seq("%c%c".format(a, b))
	    else Seq()
	  }
	};System.out.println("""perms  : scala.collection.immutable.IndexedSeq[String] = """ + $show(perms ));$skip(97); 
	val perms2 = for {
		  a <- chars
		  b <- chars
		  if a != b
		} yield "%c%c".format(a, b);System.out.println("""perms2  : scala.collection.immutable.IndexedSeq[String] = """ + $show(perms2 ));$skip(44); 
  println("Welcome to the Scala worksheet")}
}
