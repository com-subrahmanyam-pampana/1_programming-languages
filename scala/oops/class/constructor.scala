//We have 2 types of constractures
class Student(id:Int){
    var name:String=null;
    def show()={
      println(id + " " +name)
    }
    def this(id:Int,name:String)={
      this(id)
      this.name=name;
    }
}
object MainObject{
 def main(args:Array[String]):Unit={
     var student=new Student(101,"Subbu")
     student.show();
 }
}