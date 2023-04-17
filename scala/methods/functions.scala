

/*
 Syntax:
    def funcName(parm:dataType):<return type>={

    }
    "=" is oprional 
    If you put "=" ,it will return the function result
*/
object  Function{

    def test1():Unit={
        /*This functinn is not returning anything*/
         println("Hello")
    }

    def test2():Int={
         return 2;
    }

    def test3(a:Int,b:Int ):Int={
         return a+b;
    }

    def test4(a:Int=0,b:Int=1 ):Int={
        println("<<<<<<<<<<<<Function with default value>>>>>>>>>>>>>")
         return a+b;
    }

    def test5(a:Int=0,b:Int=1 )={
        println("<<<<<<<<<<<<Nmaed Paramters>>>>>>>>>>>>>")
        var result = test3(a=12,b=3);
        println(result)
    }



    def main(args:Array[String]):Unit={
       test1()
       var a:Int=test2()
       println(a)
       var sum=test3(2,5);
       println(sum)

       var defaultValueSum=test4() 
       println(defaultValueSum)

       test5()
    }
}