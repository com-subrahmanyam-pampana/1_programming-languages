/*
// same function name different arguments
func test() { ... }
func test(value: Int) -> Int{ ... }
func test(value: String) -> String{ ... }
func test(value1: Int, value2: Double) -> Double{ ... }
*/

// function with Int type parameter
func displayValue(value: Int) {
    print("Integer value:", value)
}

// function with String type parameter
func displayValue(value: String) {
    print("String value:", value)
}

// function call with String type parameter
displayValue(value: "Swift")

// function call with Int type parameter
displayValue(value: 2)