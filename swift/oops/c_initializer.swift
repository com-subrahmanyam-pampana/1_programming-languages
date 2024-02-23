
/*
we can also initialize values using the initializer.
*/
class Bike {

  // properties with no default values
  var name: String
  var gear: Int

  // assign value using initializer
  init(name: String, gear: Int){
    self.name = name
    self.gear = gear
  }
}

// object of Person with custom initializer 
var bike1 = Bike(name: "BMX Bike", gear: 2)

print("Name: \(bike1.name) and Gear: \(bike1.gear)")