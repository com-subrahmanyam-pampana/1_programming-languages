/*
The type keyword is there to create a new type.
*/

// Golang program to demonstrate
// the use of the "type" keyword

package main

import "fmt"

func typeKeyWords() {
	type MyType int
	var num MyType = 10

	fmt.Println("Num: ", num)
}

/*
In the main() function, we created our own type MyType using the type
keyword. After that, we created the variable num using MyType
and initialized it with 10. Then we printed the value of num on
the console screen.
*/
