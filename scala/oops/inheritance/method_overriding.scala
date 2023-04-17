class Employee{
   var basicPay:Float=1000;
   def printSalary()={
    println("Salary is "+basicPay)
   }
}

class SoftWareEmployee extends Employee {
    var variblePay:Float=90000;
    var salary=variblePay+basicPay;
    override def printSalary()={
      println("Salary is "+salary)
    }
}


class HardWareEmployee extends Employee{
    var variblePay:Float=4000;
    var salary=variblePay+basicPay;
   
}

object InheritanceTest{
   def main(args:Array[String]):Unit={
       var softwareEmp=new SoftWareEmployee()
       softwareEmp.printSalary();
       var hardwareEmp=new HardWareEmployee()
       hardwareEmp.printSalary();
    }
}

