/*
Scala Trait
A trait is like an interface with a partial implementation.
In scala, trait is a collection of abstract and non-abstract methods. You can create trait that can have all abstract methods or 
some abstract and some non-abstract methods.
*/

trait Printable{  
    def print():Unit  
}  

trait Showable{  
   def show():Unit  
}    
class A4 extends Printable{  
    def print():Unit={  
        println("Hello")  
    }  
}  
class A6 extends Printable with Showable{  
    def print():Unit={  
        println("This is printable")  
    }  
    def show():Unit={  
        println("This is showable");  
    }  
}  

//If a class extends a trait but does not implement the members declared
// in that trait, it must be declared abstract.
abstract class A4 extends Printable{            // Must declared as abstract class  
   def printA4():Unit={  
       println("Hello, this is A4 Sheet")  
   }  
} 
  
object MainObject{  
    def main(args:Array[String]):Unit={  
        var a = new A4()  
        a.print()  

        var a = new A6()  
        a.print()  
        a.show() 
    }  
}  


