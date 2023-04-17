/*

Scala Stream
Stream is a lazy list. 
It evaluates elements only when they are required. 
This is a feature of scala. Scala supports lazy computation. 
It increases performance of your program.
*/

object MainObject{  
    def main(args:Array[String]):Unit={  
        val stream = 100 #:: 200 #:: 85 #:: Stream.empty  
        println(stream)  
    }  
}  