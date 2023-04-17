
import scala.util.control.Breaks._
/*In scala there is no break statement.You need to use break mehtod */
object Break{
    def test1():Unit={
        breakable{
            for(i<-1 to 10 by 2){
             if(i==7)
               break
             else  
               print(i)  
            }
        }

    }
    def main(args:Array[String]):Unit={
        test1()
    }
}