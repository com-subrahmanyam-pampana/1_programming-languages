

let possibleNumber = "123"
let convertedNumber = Int(possibleNumber)
// The type of convertedNumber is "optional Int"
var serverResponseCode: Int? = 404
// serverResponseCode contains an actual Int value of 404
serverResponseCode = nil
// serverResponseCode now contains no value
//If you define an optional variable without providing a default value, the variable is automatically set to nil:
var surveyAnswer: String?
/*
You can use an if statement to find out whether an optional contains a value by comparing the optional against nil. You perform this comparison with the “equal to” operator (==) or the “not equal to” operator (!=).

If an optional has a value, it’s considered as “not equal to” nil:
*/
let possibleNumber = "123"
let convertedNumber = Int(possibleNumber)


if convertedNumber != nil {
    print("convertedNumber contains some integer value.")
}
// Prints "convertedNumber contains some integer value."
