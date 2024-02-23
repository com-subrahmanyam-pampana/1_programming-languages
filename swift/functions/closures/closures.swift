/*
A closure is a special type of function without the function name.
*/

var greet = {
  print("Hello, World!")
}

greet()

/*closure that accepts one parameter*/
let greetUser = { (name: String)  in
    print("Hey there, \(name).")
}
greetUser("Delilah")

/*Closure That Returns Value*/

var findSquare = { (num: Int) -> (Int) in
  var square = num * num
  return square
}
var result = findSquare(3)

print("Square:",result)