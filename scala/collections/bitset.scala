
//Bitset accepts only positive integers
import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty set>>>>>>>>")
        var set1=BitSet();
        println(set1)
    }
    def test2():Unit={
        println("<<<<<<<<Non Empty set>>>>>>>>")
        var set1=BitSet(1,2,3);
        println(set1)
    }
    def test3():Unit={
        println("<<<<<<<< Dupicates removed in set>>>>>>>>")
        var set1=BitSet(6,1,2,3,5);
        println(set1)
    }

    def test4():Unit={
        println("<<<<<<<< Add element>>>>>>>>")
        var set1=BitSet(6,1,2,3,5);
        set1+=100
        set1-=1
        println(set1)
    }

    def test5():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var set1=BitSet(6,1,2,3,5);
        for(a<-set1){
         println(a)
        }
        //Using for each
        set1.foreach((element:Int)=> println(element))  
    }
    
    def test6():Unit={
        println("<<<<<<<< set vs Hashset>>>>>>>>")
        var set1=Set(6,1,-2,3,-5);
        var set2=BitSet(6,1,2,3,5);
        println("Set :")
        for(a<-set1){
         println(a)
        }
        println("Bit Set :")
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