

/*
2 ways to create thread

1.By extending Thread class
2.By implememnting Runnable interface
*/




object MainObject{

    def test1():Unit={
       try{
         100/0;
       }catch{
         case error1:ArithmeticException=>println("I am working ")
       }
       try{
         100/0;
       }catch{
         case error:ArithmeticException=>println(error)
       }
    }

    def test2():Unit={
       println("<<<<<<<<<Throbale>>>>>>>>>") 
       try{
         var arr=Array(1,2);
         arr(10)
       }catch{
        /*Second case can handle any type of errors*/
         case error1:ArithmeticException=>println("I am working ")
         case exception:Throwable=>println("Found an unknow error"+exception)
       }
      
    }

    def test3():Unit={
       println("<<<<<<<<<Finally>>>>>>>>>")
       try{
         var arr=Array(1,2);
         arr(10)
       }catch{
        /*Second case can handle any type of errors*/
         case error1:ArithmeticException=>println("I am working ")
         case exception:Throwable=>println("Found an unknow error"+exception)
       }
       finally{
        println("Final block")
       }
       println("Rest")
      
    }
    
    def main(args:Array[String]):Unit={
       test1()
       test2()
       test3()
    }
}