package tour

import scala.reflect.io.File
import java.util.Scanner
object loanPattern {

def withScanner(f: File, op: Scanner => Unit) = {
    val scanner = new Scanner(f.bufferedReader)
    try {
        op(scanner)
    } finally {
        scanner.close()
    }
}

withScanner(File("/proc/self/stat"),
    scanner => println("pid is " + scanner.next()))
    
    
def getProperty(name: String): Option[String] = {
  val value = System.getProperty(name)
  if (value != null) Some(value) else None
}

val osName = getProperty("os.name")

osName match {
  case Some(value) => println(value)
  case _ => println("none")
}

println(osName.getOrElse("none"))

osName.foreach(print _)
    
class ScalaCurrentVersion(val url: String) {
  lazy val source= {
    println("fetching from url...")
    scala.io.Source.fromURL(url).getLines().toList
  }
  lazy val majorVersion = source.find(_.contains("version.major"))
  lazy val minorVersion = source.find(_.contains("version.minor"))
}

val version = new ScalaCurrentVersion(
  "https://raw.github.com/scala/scala/master/build.number")
println("get scala version from " + version.url)
version.majorVersion.foreach(println _)
version.minorVersion.foreach(println _)

    
  println("Welcome to the Scala worksheet")
}