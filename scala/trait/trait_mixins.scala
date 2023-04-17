/*
Scala Trait Mixins
In scala, trait mixins means you can extend any number of traits with a class or abstract class. You can extend only traits or combination of traits and class or traits and abstract class.

It is necessary to maintain order of mixins otherwise compiler throws an error.
*/

trait Print{  
    def print():Unit  
}  
  
abstract class PrintA4{  
    def printA4():Unit  
}  
  
class A6 extends Print with PrintA4{  
    def print():Unit={                // Trait print  
        println("print sheet")  
    }  
    def printA4():Unit={              // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]):Unit={  
        var a = new A6()  
        a.print()  
        a.printA4()  
    }  
}  