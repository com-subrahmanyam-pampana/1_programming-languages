/*
2 ways to create thread

1.By extending Thread class
2.By implememnting Runnable interface
*/

class Thread1 extends Thread{
    override def run():Unit={
        println("Thread1 is running")
    }
}

class Thread2 extends Runnable{
    override def run():Unit={
        println("Thread2 is running")
    }
}
object MainObject{

    def test1():Unit={
       var thread1=new Thread1(); 
       thread1.start()  
    }

     def test2():Unit={
       var runableInstance=new Thread2(); 
       var myThread=new Thread(runableInstance);
       myThread.start()  
    }
    def main(args:Array[String]):Unit={
       test1()
       test2()
    }
}