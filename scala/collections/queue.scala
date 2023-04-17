/*
List:
Queue implements a data structure that allows 
inserting and retrieving elements in a first-in-first-out (FIFO) manner.

In scala, Queue is implemented as a pair of lists. 
One is used to insert the elements and second to contain deleted elements. 
Elements are added to the first list and removed from the second list.
*/



import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty Vectoe>>>>>>>>")
        var v1=Queue();
        println(v1)
    }
    def test2():Unit={
        var vector:Queue[Int] = Queue(5,8,3,6,9,4) //Or  
        var vector2 = Queue(5,2,6,3)  
        var vector3 = Queue.empty  
        println(vector)  
        println(vector2)  
        println(vector3)  
    }

    def test3():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var vector:Queue[Int] = Queue(5,8,3,6,9,4) //Or  
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
