

import scala.collection.immutable._  
object MainObject{  
    def test1():Unit={
        println("<<<<<<<<Empty set>>>>>>>>")
        var set1=Seq();
        println(set1)
    }
    def test2():Unit={
        println("<<<<<<<<Non Empty set>>>>>>>>")
        var seq1:Seq[String]=Seq("Subbu","Ram","Sita");
        println(seq1)
        var seq2:Seq[Int]=Seq(1,2,3);
        println(seq2)
    }

    def test3():Unit={
        println("<<<<<<<< Iteration>>>>>>>>")
        var seq1:Seq[String]=Seq("Subbu","Ram","Sita");
        for(a<-seq1){
         println(a)
        }
        //Using for each
        seq1.foreach((element:String)=> println(element))  
    }


    def main(args:Array[String]):Unit={  
        test1()
        test2()  
        test3()
        
    }  
}  