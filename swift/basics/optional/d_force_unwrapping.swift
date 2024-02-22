/*
When nil represents an unrecoverable failure, 
such as a programmer error or corrupted state, 
you can access the underlying value by adding an 
exclamation mark (!) to the end of the optional’s name. 
This is known as force unwrapping the optional’s value. 
When you force unwrap a non-nil value, the result is its unwrapped value. 
Force unwrapping a nil value triggers a runtime error.
*/

let possibleNumber = "123" //replace with 123a gives an error
let convertedNumber = Int(possibleNumber)
// The type of convertedNumber is "optional Int"
let number = convertedNumber!

guard let x = convertedNumber else {
    fatalError("The number was invalid")
}
print(x) // it prints 123.Varible is unwrapped