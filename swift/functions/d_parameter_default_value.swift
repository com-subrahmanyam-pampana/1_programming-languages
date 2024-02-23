func addNumbers( a: Int = 7,  b: Int = 8) {
  var sum = a + b
  print("Sum:", sum)
}

// function call with two arguments
addNumbers(a: 2, b: 3)

// function call with one argument
addNumbers(a: 2)

// function call with no arguments
addNumbers()