/*
Vector:
1.Vector is a general-purpose, immutable data structure. 
2.It provides random access of elements. 
3.It is good for large collection of elements.
*/



import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty Vectoe>>>>>>>>")
        var v1=Vector();
        println(v1)
    }
    def test2():Unit={
        var vector:Vector[Int] = Vector(5,8,3,6,9,4) //Or  
        var vector2 = Vector(5,2,6,3)  
        var vector3 = Vector.empty  
        println(vector)  
        println(vector2)  
        println(vector3)  
    }

    def test3():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var vector:Vector[Int] = Vector(5,8,3,6,9,4) //Or  
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
