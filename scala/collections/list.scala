/*
List:
List is used to store ordered elements. 
It extends LinearSeq trait.
It is a class for immutable linked lists. 
This class is good for last-in-first-out (LIFO), stack-like access patterns.
*/



import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty Vectoe>>>>>>>>")
        var v1=List();
        println(v1)
    }
    def test2():Unit={
        var vector:List[Int] = List(5,8,3,6,9,4) //Or  
        var vector2 = List(5,2,6,3)  
        var vector3 = List.empty  
        println(vector)  
        println(vector2)  
        println(vector3)  
    }

    def test3():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var vector:List[Int] = List(5,8,3,6,9,4) //Or  
        for(a<-vector){
         println(a)
        }
        //Using for each
        vector.foreach((element:Int)=> println(element))  
    }


    def main(args:Array[String]):Unit={  
        test1()
        test2()  
        test3()
       
    }  
}  
