class Addition{
    /*All fields must be initialized*/
    def add(a:Int,b:Int):Unit={
        println(a+b);
    }
    def add(a:Int,b:Int,c:Int):Unit={
        println(a+b+c);
    }
}

object MainObject{
    def test1():Unit={
        println("<<<<<<<<<Method Overloading>>>>>>>>>")
        var myobject=new Addition();
        myobject.add(1,1);
        myobject.add(1,1,1);
    }
    def main(args:Array[String]):Unit={
       test1()
    }
}