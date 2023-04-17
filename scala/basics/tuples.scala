
object Tuples {
  def test1():Unit={
    println("<<<<<<<<<<Test 1>>>>>>>>>")
    var tuple1=(1,2,3,4);
    println(tuple1)
    /*Fetch elements*/
    println("Fetch elememts:")
    println(tuple1._1)
    println(tuple1._2)
    var tuple2=("Apple","Bananna");
    var tuple3=("Apple","Bananna",1,true);
    
    println(tuple2)
    println(tuple3)
  }

  def test2():Unit={
    println("<<<<<<<<<<Iteration>>>>>>>>>")
    var tuple1=(1,2,3,4);
    tuple1.productIterator.foreach(println) 
  }
  def main(args:Array[String]) : Unit ={  
      test1();
      test2()       
  }  
}