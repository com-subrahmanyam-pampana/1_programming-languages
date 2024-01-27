package main

import "fmt"

/*
Using var keyword we can define the varibles
Every Go varible need to be defined with var keyword

var <YOUR VAR NAME> <DATATYPE>
*/
func method1() {

	var myvar int
	myvar = 43
	fmt.Println(myvar)

	/*You can assign value directly while declaring*/
	var myvarWithValue int = 143
	fmt.Println(myvarWithValue)

	var myvar2 string
	myvar2 = "subbu"
	fmt.Println(myvar2)

	var myvar3 bool
	myvar3 = true
	fmt.Println(myvar3)

	var myvar4 float32
	myvar4 = 32.44
	fmt.Println(myvar4)

	var myvar5 byte
	myvar5 = 2
	fmt.Println(myvar5)

	var myvar6 rune
	myvar6 = 'a'
	fmt.Println(myvar6)

}

func defineAllVariblesAtOnce() {
	fmt.Println("<<<<<< Method3 >>>>>>>>>>.")
	///You can define multiple variables at once.
	var i, j, k, l int
	var c, ch byte
	var f, salary float32

	fmt.Println(i + j + k + l)
	fmt.Println(c + ch)
	fmt.Println(f + salary)

}

func shortVariableDeclaration() {
	/*
		The := syntax is shorthand for declaring and initializing a variable
	*/
	//This is used inside function only and not applicable for global varible
	// This is a local variables
	d := "This is defined using the Short varible"
	fmt.Println(d)
}

func initializedVariablesDataType() {
	/*Go will infer the type of initializedVariablesDataType*/
	/*You can omit the data type while declarying
	and assigning values at the same time.
	*/
	var myvar = 20
	fmt.Println(myvar) //infer to int

	var myvar2 = "U.S.A"
	fmt.Println(myvar2) //infer to string

}
