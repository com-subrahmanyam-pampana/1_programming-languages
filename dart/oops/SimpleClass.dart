void main() {
  // Defining class
  // Creating Object called std
  var std = new Student();
  std.stdName = 'sUBBU';
  print(std);
  print(std.stdName);
}

class Student {
  var stdName;
  var stdAge;
  var stdRoll_nu;

  // Class Function
  showStdInfo() {
    print("Student Name is : ${stdName}");
    print("Student Age is : ${stdAge}");
    print("Student Roll Number is : ${stdRoll_nu}");
  }
}
