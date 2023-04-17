

object IfStatements{

    def main(args:Array[String]):Unit={
      test1();
      test2()
    }

    def test1():Unit={
      var myInt=2;
      if(myInt==1){
        println("number entered is 1")
      }else if(myInt==2) {
        println("number entered is  2")
      }else{
        println("number entered is nor 2 nor 1")
      }
    }

    def test2():Unit={
       /*Scala If statement as better alternative to Ternary operator*/ 
       /*Scala does not have ternary operator but we can use if*/
       /*You can assign if sattement result to a function*/
       /*If function can trturn value*/
      var myInt=2;
      println(isEven(23))
      println(isEven(24))
    }
    def isEven(a:Int)=(if(a%2==0)true else false)

}