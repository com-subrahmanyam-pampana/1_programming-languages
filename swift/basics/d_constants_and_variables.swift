var environment:String;
environment="development" 

let apiURL: String;
// apiURL has no value yet.
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


