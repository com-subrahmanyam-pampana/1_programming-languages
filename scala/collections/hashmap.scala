

import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty Map>>>>>>>>")
        var set1=HashMap();
        println(set1)
    }
    def test2():Unit={
        println("<<<<<<<<Non Empty Map>>>>>>>>")
        var map1=HashMap(("A","Apple"),("B","Ball"));
        println(map1)
        //You can use "->" to add elements
        var map2=HashMap("A"->"Apple","B"->"Ball");
        println(map1)
        var map3=HashMap[String,String](("A","Apple"),("B","Ball"));
        println(map3)
        println("<<<<<<<<Accessing elememts>>>>>>>>")
        println(map3("A"))
    }
    def test3():Unit={
        println("<<<<<<<<Adding and removing elememts>>>>>>>>")
        var map1=HashMap(("A","Apple"),("B","Ball"));
        println(map1+("C"->"Cat"))
        println(map1-"B")
    }

   

    def test4():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var map1=HashMap(("A","Apple"),("B","Ball"));
        for(a<-map1){
         println(a)
        }
        //Using for each
        map1.foreach((element:(String,String))=> println(element))  
    }


    def main(args:Array[String]):Unit={  
        test1()
        test2()  
        test3()
        test4()
       
    }  
}  