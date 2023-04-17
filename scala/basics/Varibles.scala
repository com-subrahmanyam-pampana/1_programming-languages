/*Use var for mutable values and val for immutable values*/
object HelloWorld {
  var myIntVar3:Int=200;
 

  
  
  /*Var keyword*/
  def test1():Unit={
    println("<<<<<<<<<<Test 1>>>>>>>>>")
     /*
     You can create mutable variable using var keyword. 
     It allows you to change value after declaration of variable.
     */ 
    /*Scala is a type infers language.You no need to specfify type explicitly*/
    var data=100;
    println(data)
    data=23;
    println(data)
  }

   /*val keyword*/
   def test2():Unit={
    println("<<<<<<<<<<Test 2>>>>>>>>>")
     /*
    You can not  resassign a varible if you define with val
     */ 
    // val data=100;
    // println(data)
    // data=23;
    // println(data)
  }
  /*var keyword and type*/
  def test3():Unit={
    println("<<<<<<<<<<Test 3:var keyword and data type>>>>>>>>>")
     /*
    You can define data type using var and :
     */ 
    var data:Int=100;
    println(data)
    
  }

  /*You can not change data type of a verible*/
  def test4():Unit={
    // println("<<<<<<<<<<Test 4:You can not change data type>>>>>>>>>")
    // var myIntVar:Int=100;
    // myIntVar="I am a string now"
  }

  /*Declaration of variable a not allowed inside function.You can do in classes*/
  def test5():Unit={
    // println("<<<<<<<<<<Test 5:Declaration of variable a not allowed inside function>>>>>>>>>")
    // var myIntVar:Int=100;
    // println(myIntVar)
    // var myIntVar2:Int;
    // myIntVar2=200;
    // println(myIntVar2)
    // //myIntVar2 will throw an error.Because you are defining and add data later
  }

  /*Global value*/
  def test6():Unit={
    println("<<<<<<<<<<Test 6:Global value>>>>>")
    println(myIntVar3)
  }



  def main(args:Array[String]) : Unit ={  
      test1();  
      test3(); 
      test5(); 
      test6(); 
   }  
}