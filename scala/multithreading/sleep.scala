/*
2 ways to create thread

1.By extending Thread class
2.By implememnting Runnable interface
*/




object MainObject{

    def test1():Unit={
       println("HI")
       Thread.sleep(5000)
       println("Bye")
    }

    
    def main(args:Array[String]):Unit={
       test1()
       
    }
}