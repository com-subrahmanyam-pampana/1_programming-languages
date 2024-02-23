struct Bike {
  var color: String

  init(color:String) {
    self.color = color
  }
}

var bike1 = Bike(color: "Blue")

var bike2 = bike1

bike1.color = "Red"
print(bike2.color)  // prints blue