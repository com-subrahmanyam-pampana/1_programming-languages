class Human{
    constructor(name){
        this.name=name;
    }
}
class Student extends Human{
    constructor(name,roll_number){
          super(name);
          this.roll_number=roll_number;  
    }
}

let student=new Student("Subbu",23);
console.log(student.name);
console.log(student.roll_number);