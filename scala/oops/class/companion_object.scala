/*
Scala Companion Object
In scala, when you have a class with same name as 
singleton object, it is called companion class and the
 singleton object is called companion object.
*/
class ComapanionClass{  
    def hello():Unit={  
        println("Hello, this is Companion Class.")  
    }  
}  
object CompanoinObject{  
    def main(args:Array[String]):Unit={  
        new ComapanionClass().hello()  
        println("And this is Companion Object.")  
    }  
}  