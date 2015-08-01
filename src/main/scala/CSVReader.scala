import scala.io.Source

object CSVReader {
  def main(args: Array[String]): Unit = {

    val src = Source.fromFile("/home/hashem/workspace/scala_reader/resources/test.csv").getLines().toList
    val zones = src.head.split(',').toList.drop(1)
    val parsedData = src.tail.toList.map(x => (x.split(',').toList)).map(x => (x.head , zones.zip(x.tail))).foreach{ dataItem =>
      dataItem._2.foreach{ zRate =>
              println(s" INSERT INTO Table (weight,rate,zone) values(${dataItem._1},${zRate._1},${zRate._2});")
      }
    }
  }

  def backup_working_copy = {
    val src = Source.fromFile("/home/hashem/workspace/scala_reader/resources/test.csv").getLines().toList
    val zones = src.head.split(',').toList.drop(1)
    val parsedData = src.tail.toList.map(x => (x.split(',').toList)).map(x => (x.head , zones.zip(x.tail)))

    parsedData.foreach{ q =>
      q._2.foreach{ zr =>
        println(s" INSERT INTO Table (weight,rate,zone) values(${q._1}.trim,${zr._1}.trim,${zr._2}.trim) ")
      }
    }
  }
}
