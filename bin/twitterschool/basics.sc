package twitterschool

object basics {
	
	def addOne(m: Int): Int = m + 1           //> addOne: (m: Int)Int
	addOne(10)                                //> res0: Int = 11
	
	val three = addOne(2)                     //> three  : Int = 3
	def _3() = 1 + 2                          //> _3: ()Int
	
	val add1 = (x: Int) => x + 1              //> add1  : Int => Int = <function1>
	add1(99)                                  //> res1: Int = 100
	 
	def adder(m: Int, n: Int) = m + n         //> adder: (m: Int, n: Int)Int
	def add3 = adder(3, _:Int)                //> add3: => Int => Int
	add3(7)                                   //> res2: Int = 10
	add3(70)                                  //> res3: Int = 73
	
	def multiply_curry(m: Int)(n: Int): Int = m * n
                                                  //> multiply_curry: (m: Int)(n: Int)Int
	def multiply_nonCurry(m: Int,n: Int): Int = m * n
                                                  //> multiply_nonCurry: (m: Int, n: Int)Int
	multiply_curry(2)(3)                      //> res4: Int = 6
	multiply_nonCurry(2,3)                    //> res5: Int = 6
	
  def multiply_nonCurry2(m: Int,n: Int) = multiply_curry(m)(n)
                                                  //> multiply_nonCurry2: (m: Int, n: Int)Int
  multiply_nonCurry2(2,3)                         //> res6: Int = 6
  
  val curriedAdd = (adder _).curried              //> curriedAdd  : Int => (Int => Int) = <function1>
 	def add9 =  curriedAdd(9)                 //> add9: => Int => Int
 	add9(56)                                  //> res7: Int = 65
 		
 	def capitalizeAll(args: String*) = {
 		args.map(arg => arg.capitalize)
	}                                         //> capitalizeAll: (args: String*)Seq[String]
  capitalizeAll("hashem jack")                    //> res8: Seq[String] = ArrayBuffer(Hashem jack)
  capitalizeAll("hashem", "john baktash")         //> res9: Seq[String] = ArrayBuffer(Hashem, John baktash)
  
  class Calculator(val brand: String, val model: String) {
        def add(m: Int, n: Int): Int = m + n
  }
  
  val c  = new Calculator("hp","30B")             //> c  : twitterschool.basics.Calculator = twitterschool.basics$$anonfun$main$1$
                                                  //| Calculator$1@77b52d12
 	c.brand                                   //> res10: String = hp
  
  object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  	}
	}
  
  Timer.currentCount()                            //> res11: Long = 1
  Timer.currentCount()                            //> res12: Long = 2
  Timer.currentCount()                            //> res13: Long = 3
  Timer.currentCount()                            //> res14: Long = 4
  Timer.currentCount()                            //> res15: Long = 5
  
 val times = 1                                    //> times  : Int = 1

	//Matching with values
	times match {
	  case 1 => "one"
	  case 2 => "two"
	  case _ => "some other number"
	}                                         //> res16: String = one

	//Matching with guards
  times match {
	  case i if i == 1 => "one"
	  case i if i == 2 => "two"
	  case _ => "some other number"
	}                                         //> res17: String = one
	
	//Matching with types
	def bigger(obj: Any): Any = {
	  obj match {
	    case i: Int if i < 0 => i - 1
	    case i: Int => i + 1
	    case d: Double if d < 0.0 => d - 0.1
	    case d: Double => d + 0.1
	    case text: String => text + "s"
	    case _ => "Shit Happens"
    }
  }                                               //> bigger: (obj: Any)Any
  
  bigger(5.75)                                    //> res18: Any = 5.85
  bigger(5)                                       //> res19: Any = 6
  bigger('C')                                     //> res20: Any = Shit Happens
  bigger("CString!")                              //> res21: Any = CString!s
 
  def calcType(calc: Calculator) = calc match {
	  case _ if calc.brand == "hp" && calc.model == "20B" => "financial"
	  case _ if calc.brand == "hp" && calc.model == "48G" => "scientific"
	  case _ if calc.brand == "hp" && calc.model == "30B" => "business"
	  case _ => "unknown"
	 }                                        //> calcType: (calc: twitterschool.basics.Calculator)String
	 
	calcType(c)                               //> res22: String = business
  val c2 =new Calculator("hp","20B")              //> c2  : twitterschool.basics.Calculator = twitterschool.basics$$anonfun$main$
                                                  //| 1$Calculator$1@2d554825
  calcType(c2)                                    //> res23: String = financial
  
  
  
  
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}