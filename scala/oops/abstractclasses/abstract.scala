abstract class Employee{
   var basicPay:Float=1000;
   def getBasicPay():Unit
   def getTotalSalary():Unit
}

class SoftWareEmployee extends Employee {
    var variblePay:Float=90000;
    var salary=variblePay+basicPay;
    def getBasicPay()={
      println(basicPay) ;
    }
    def getTotalSalary()={
      println(salary) ;
    }
}


class HardWareEmployee extends Employee{
    var variblePay:Float=4000;
    var salary=variblePay+basicPay;
     def getBasicPay()={
      println(basicPay);
    }
     def getTotalSalary()={
      println(salary) ;
    }
}

object InheritanceTest{
   def main(args:Array[String]):Unit={
       var softwareEmp=new SoftWareEmployee()
       softwareEmp.getBasicPay()
       softwareEmp.getTotalSalary()
       var hardwareEmp=new HardWareEmployee()
    }
}

