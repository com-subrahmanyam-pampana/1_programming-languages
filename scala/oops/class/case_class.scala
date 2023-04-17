/*
Scala Case Classes and Case Object:
1.Scala case classes are just regular classes which are 
immutable by default and decomposable through pattern matching.
2.It uses equal method to compare instance structurally. 
It does not use new keyword to instantiate object.
3.All the parameters listed in the case class are public
and immutable by default.
Syntax:
case class className(parameters)  

*/


case class CaseClass(a:Int, b:Int)  
  
//Pattern matching related code
trait SuperTrait  
case class CaseClass1(a:Int,b:Int) extends SuperTrait  
case class CaseClass2(a:Int) extends SuperTrait         // Case class  
case object CaseObject extends SuperTrait               // Case object  
 
object MainObject{  

    def test1():Unit={  
        println("<<<<<<<<<<Case class <<<<<<<<<<<<") 
        var c =  CaseClass(10,10)       // Creating object of case class  
        println("a = "+c.a)               // Accessing elements of case class  
        println("b = "+c.b)  
    }  

    def test2():Unit={  
        println("<<<<<<<<<<Pattern Matching<<<<<<<<<<<<") 
        callCase(CaseClass1(10,10))  
        callCase(CaseClass2(10))  
        callCase(CaseObject)   
    }  

    def callCase(f:SuperTrait) = f match{  
        case CaseClass1(f,g)=>println("a = "+f+" b ="+g)  
        case CaseClass2(f)=>println("a = "+f)  
        case CaseObject=>println("No Argument")  
    }  

    def main(args:Array[String]):Unit={  
        test1();
        test2();
    }  
} 

