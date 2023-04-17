




/*
Higher Order
=Function which takes function as an argument or returns function

*/


object  HigherOrder{

     //////////////Test 1/////////////////
    def test1():Unit={
       println("<<<<<<<<<<<<<<<Passing functioon as arg>>>>>>>>>>")
       //printBinaryOperationsOutput print sum or mul of 2 numbers
       //Pass 2 numbers ,and type of opersion and function that performs the opersion
       printBinaryOperationsOutput(2,3,"sum",addTwoNumbers);
       printBinaryOperationsOutput(2,3,"mul",mulTwoNumbers);
    }

    def printBinaryOperationsOutput(a:Int,b:Int,operationType:String,myFunc:(Int,Int)=>AnyVal)={
      if(operationType=="sum"){
        println("Sum of numbers is"+myFunc(a,b))
      }else{
         println("Mul of numbers is"+myFunc(a,b))
      }
    }

    def addTwoNumbers(a:Int,b:Int):Int={
       return a+b;
    }

    def mulTwoNumbers(a:Int,b:Int):Int={
       return a*b;
    }



     //////////////Test 2/////////////////
     ///Function Composition

     def test2():Unit={
       println("<<<<<<<<<<<<<<<Composite function>>>>>>>>>>")
       var result=mulNumberBy2(add2ToNumber(10))
       println(result)
     }
     def add2ToNumber(a:Int):Int={
        a+2;
     }
     def mulNumberBy2(a:Int):Int={
        a*2;
     }

      //////////////Test 3/////////////////

        //Anonymous functions are functions with no name
     def test3():Unit={
       println("<<<<<<<<<<<<<<<Anonymous function(Lambda)>>>>>>>>>>")
       ////By using "=>" rocket
       var result1=(a:Int,b:Int)=>a+b;
       println(result1(3,7))
       var result2=(_:Int)+(_:Int)
       println(result2(23,4))
     }




     //////////////Test 4/////////////////
      def test4():Unit={
       println("<<<<<<<<<<<<<<<Nested function>>>>>>>>>>")
       def sum(a:Int,b:Int):Int={
           return a+b;
       }
       println(sum(10,1001))
     }


     //////////////Test 5/////////////////
      def test5():Unit={
       println("<<<<<<<<<<<<<<<Varible length parameters>>>>>>>>>>")
       
       println(sumOfFirstNNaturalNumbers(1,2,3,4,5))
     }
     def sumOfFirstNNaturalNumbers(n:Int*):Int={
         var sum=0;
         for (a <-n){
            sum=sum+a;
         }
         return sum;
     }
     

    def main(args:Array[String]):Unit={
       test1()
       test2()
       test3()
       test4()
       test5()
    }
}