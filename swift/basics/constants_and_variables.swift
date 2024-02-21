
/*
You declare constants with the let keyword and variables with the var keyword. 
*/

let maximumNumberOfLoginAttempts = 10
var currentLoginAttempt = 0
currentLoginAttempt=1
//You can change the value of an existing variable to another value of a compatible type. 
// Unlike a variable, the value of a constant can’t be changed after it’s set. 
// maximumNumberOfLoginAttempts=12; // error: let variables are not mutable
print("maximumNumberOfLoginAttempts",maximumNumberOfLoginAttempts)

var environment = "development"
let apiURL: String
// maximumNumberOfLoginAttempts has no value yet.
if environment == "development" {
    apiURL = "http://localhost"
} else {
    apiURL = "http://www.yourwebsite.com"
}
print("apiURL",apiURL)
/*
In this example, the apiURL is constant, and its value depends on the environment. 
In the development environment, it has a value of localhost; 
in any other environment, its value is yourweb address. 
Both branches of the if statement initialize apiURL with some value, 
guaranteeing that the constant always gets a value. 
*/

/*
You can declare multiple constants or multiple variables on a single line, 
separated by commas
*/
var x = 0.0, y = 0.0, z = 0.0

/*
Type Annotations
*/
