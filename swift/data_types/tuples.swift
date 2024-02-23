

/*
Tuples group multiple values into a single compound value. 
The values within a tuple can be of any type and don’t have to be 
of the same type as each other.
*/
let http404Error = (404, "Not Found")
let (statusCode, statusMessage) = http404Error
print("The status code is \(statusCode)")
// Prints "The status code is 404"
print("The status message is \(statusMessage)")
// Prints "The status message is Not Found"
// http404Error is of type (Int, String), and equals (404, "Not Found")
//You can decompose a tuple’s contents into separate constants or variables, which you then access as usual
