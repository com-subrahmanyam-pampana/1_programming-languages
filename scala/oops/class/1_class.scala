class Student{
    /*All fields must be initialized*/
    var id:Int=0
    var name:String=null;
}

/*In scala we can create a constructor in class defination itself*/
/*This is called Primary Constructor*/
class Student2(id:Int,name:String){
    def show():Unit={
        println(id+ " " +name)
    }

}

class Aritmetic{
    def add(a:Int,b:Int):Unit={
        println(a+b)
    }
}
object MainObject{

    def test1():Unit={
        println("<<<<<<<<<,Simple class>>>>>>>>>")
        var student1=new Student();
        println(student1.id +" - "+student1.name)
        student1.id=1;
        student1.name="Subbu";
        println(student1.id +" - "+student1.name)
    }

    def test2():Unit={
        println("<<<<<<<<<Primary Constructor>>>>>>>>>")
        var student1=new Student2(1,"Subbu");
        println(student1.show())
    }

    def test3():Unit={
        println("<<<<<<<<<Anonymous Object>>>>>>>>>")
        //We can create Anonymous Object.Anonymous Object. does not have any reference name
        //We will create this if we don't want to resuse this.
        new Aritmetic().add(10,11)
       
    }
    def main(args:Array[String]):Unit={
       test1()
       test2()
       test3()
    }
}