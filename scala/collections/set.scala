

import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty set>>>>>>>>")
        var set1=Set();
        println(set1)
    }
    def test2():Unit={
        println("<<<<<<<<Non Empty set>>>>>>>>")
        var set1=Set("Subbu","Ram","Sita");
        println(set1)
    }
    def test3():Unit={
        println("<<<<<<<< Dupicates removed in set>>>>>>>>")
        var set1=Set("Subbu","Ram","Sita","Subbu");
        println(set1)
    }

    def test4():Unit={
        println("<<<<<<<< Add element>>>>>>>>")
        var set1=Set("Subbu","Ram","Sita","Subbu");
        set1+="Trump"
        set1-="Subbu"
        println(set1)
    }

    def test5():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var set1=Set("Subbu","Ram","Sita","Subbu");
        for(a<-set1){
         println(a)
        }
        //Using for each
        set1.foreach((element:String)=> println(element))  
    }


    def main(args:Array[String]):Unit={  
        test1()
        test2()  
        test3()
        test4()
        test5()
    }  
}  