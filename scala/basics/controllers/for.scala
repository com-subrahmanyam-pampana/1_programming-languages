
/*
   for(i <- range){
   }
   range is a value which has start and end
   You can pass range by "to" or "until"
*/
object ForLoop{

    def test1():Unit={
        ///To keyword
        println("<<<<<<<To keyword>>>>>>>")
        for(a<-1 to 10){
            print(a)
        }
    }

    def test2():Unit={
        ///To keyword
        println("<<<<<<<Until keyword>>>>>>>")
        //Until excludes the last value
        for(a<-1 until 10){
            print(a)
        }

    }
    def test3():Unit={
      println("<<<<<<<For loop as filter>>>>>>>")
        //Until excludes the last value
        for(a<-1 to  10 if a%2==0){
            print(a)
        }
    }

    def test4():Unit={
      println("<<<<<<<Yield>>>>>>>")
        //Yield returns result after completion of loop iteration
        var result=for(a<-1 to 10) yield a
        println(result)
    }
    def test5():Unit={
        println("<<<<<<<For Loop in collections>>>>>>>")
        var list=List("a","b","c","d","e")
        for(a<-list){
         print(a)
        }
    }
    def test6():Unit={
        println("<<<<<<<For each collections>>>>>>>")
        var list=List("a","b","c","d","e")
        // list.foreach(){
        //     println
        // }
        list.foreach(print)
        list.foreach((element:String)=>print(element+" + "))
    }

    def test7():Unit={
       println("<<<<<<<By keyword>>>>>>>")
       //By keyword is used to skip the iteration
       //This will skip all even iteratinns
       for(i <-1 to 10 by 2){
         print(i);
       }
    }
    def main(args:Array[String]):Unit={
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }
}