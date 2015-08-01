package tour

import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods.{pretty,render}
import java.util.Date

object DSL {

case class Twitter(id: Long, text: String, publishedAt: Option[java.util.Date]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(322); 

var twitters = Twitter(1, "hello scala", Some(new Date())) ::
  Twitter(2, "I like scala tour", None) :: Nil;System.out.println("""twitters  : List[tour.DSL.Twitter] = """ + $show(twitters ));$skip(149); 

var json = ("twitters"
  -> twitters.map(
    t => ("id" -> t.id)
      ~ ("text" -> t.text)
      ~ ("published_at" -> t.publishedAt.toString())));System.out.println("""json  : (String, List[Nothing]) = """ + $show(json ));$skip(31); val res$0 = 

println(pretty(render(json)));System.out.println("""res0: <error> = """ + $show(res$0));$skip(47); 
    
println("Welcome to the Scala worksheet")}
}
