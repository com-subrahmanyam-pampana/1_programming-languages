// create a class
class Room {

  var length = 0.0
  var breadth = 0.0

  // method to calculate area
  func calculateArea() {
    print("Area of Room =", length * breadth)
  }
}

  // create object of Room class
  var studyRoom = Room()

  // assign values to all the properties 
  studyRoom.length = 42.5
  studyRoom.breadth = 30.8

  // access method inside class
  studyRoom.calculateArea()