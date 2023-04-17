/*
Scala HashSet
HashSet is a sealed class. It extends AbstractSet and immutable Set trait.
 It uses hash code to store elements.

It neither maintains insertion order nor sorts the elements.
*/

/*
A Set represents a generic "set of values". 
A TreeSet is a set where the elements are sorted 
(and thus ordered), a HashSet is a set where the elements are not sorted or ordered.

A HashSet is typically a lot faster than a TreeSet.
*/

import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty set>>>>>>>>")
        var set1=HashSet();
        println(set1)
    }
    def test2():Unit={
        println("<<<<<<<<Non Empty set>>>>>>>>")
        var set1=HashSet("Subbu","Ram","Sita");
        println(set1)
    }
    def test3():Unit={
        println("<<<<<<<< Dupicates removed in set>>>>>>>>")
        var set1=HashSet("Subbu","Ram","Sita","Subbu");
        println(set1)
    }

    def test4():Unit={
        println("<<<<<<<< Add element>>>>>>>>")
        var set1=HashSet("Subbu","Ram","Sita","Subbu");
        set1+="Trump"
        set1-="Subbu"
        println(set1)
    }

    def test5():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var set1=HashSet("Subbu","Ram","Sita","Subbu");
        for(a<-set1){
         println(a)
        }
        //Using for each
        set1.foreach((element:String)=> println(element))  
    }
    
    def test6():Unit={
        println("<<<<<<<< set vs Hashset>>>>>>>>")
        var set1=Set("Subbu","Ram","Sita","Subbu");
        var set2=HashSet("Subbu","Ram","Sita","Subbu");
        println("Set :")
        for(a<-set1){
         println(a)
        }
        println("Hash Set :")
         for(a<-set2){
         println(a)
        }   
    }
    
    def main(args:Array[String]):Unit={  
        test1()
        test2()  
        test3()
        test4()
        test5()
        test6()
    }  
}  