


object  Recursion{

    def test1(a:Int,b:Int):Int={
        if(b==0)
        0
        else
            a+test1(a,b-1)
    }

   

    def main(args:Array[String]):Unit={
       var result=test1(15,2)
       print(result)
      
    }
}