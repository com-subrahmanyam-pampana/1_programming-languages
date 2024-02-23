
/*
// outer function
func function1() {
  // code

  // inner function
  func function2() {
    // code
  }

}
*/

// outer function
func greetMessage() {

  // inner function
  func displayName() {
    print("Good Morning Abraham!")
  }

  // calling inner function
  displayName()
}

// calling outer function
greetMessage()