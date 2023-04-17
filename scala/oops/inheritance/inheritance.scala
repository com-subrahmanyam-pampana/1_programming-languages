class Employee{
   var basicPay:Float=1000;
}

class SoftWareEmployee extends Employee {
    var variblePay:Float=90000;
    var salary=variblePay+basicPay;
    println("SoftWareEmployee Pay  is " +salary)
}


class HardWareEmployee extends Employee{
    var variblePay:Float=4000;
    var salary=variblePay+basicPay;
    println("HardWareEmployee Pay  is " +salary)
}

object InheritanceTest{
   def main(args:Array[String]):Unit={
       new SoftWareEmployee()
       new HardWareEmployee()
    }
}

