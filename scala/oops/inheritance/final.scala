class Employee{
   val basicPay:Float=1000;
}

class SoftWareEmployee extends Employee {
    val variblePay:Float=90000;
    override val basicPay:Float=2000;
    var salary=variblePay+basicPay;
    def printSalary()={
      println("Salary is "+salary)
    }
}


class HardWareEmployee extends Employee{
    val variblePay:Float=4000;
    override val basicPay:Float=1500;
    val salary=variblePay+basicPay;
    def printSalary()={
      println("Salary is "+salary)
    }
   
}

object InheritanceTest{
   def main(args:Array[String]):Unit={
       var softwareEmp=new SoftWareEmployee()
       softwareEmp.printSalary();
       var hardwareEmp=new HardWareEmployee()
       hardwareEmp.printSalary();
    }
}

