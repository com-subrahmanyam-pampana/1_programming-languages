
/*Scala does not have switch*/
/*It has pattern matching instead*/
object SwitchTest{

    def test1(myInt:Int):Unit={
     myInt match{
        case 1=>println("It is 1")
        case 2=>println("It is 2")
        case _=>println("It is neither 1 nor 2")
     }
    }
    def test2(myVar:Any):Unit={
     myVar match{
        case 1=>println("It is 1")
        case "Hi"=>println("It is a Hi")
        case _=>println("It is neither 1 nor 2 Hi")
     }
    }
    def main(args:Array[String]):Unit={
       test1(1)
       test2(1)
       test2("Hi")

    }
    
}