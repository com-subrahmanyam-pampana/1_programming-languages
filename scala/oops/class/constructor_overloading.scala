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
    println(id)
}
object MainObject{
 def main(args:Array[String]):Unit={
    new Student(101,"Subbu")
    new Student(102)
 }
}