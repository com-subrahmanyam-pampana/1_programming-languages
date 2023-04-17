package main

import "fmt"

var myGlobalVar1 int

func method1() {
	fmt.Println("<<<<<< Method1 >>>>>>>>>>.")
	//Using var keyword we can define the varibles
	//Every Go varible need to be defined with var keyword
	var myvar int
	myvar = 43
	fmt.Println(myvar)

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

	/*You can directly add value while defining */
	var myvarwithValue int = 143
	fmt.Println(myvarwithValue)
}
func method2() {
	fmt.Println("<<<<<< Method2 >>>>>>>>>>.")
	//If we donn't init the var values,it will take the default values
	var myvar1 int
	fmt.Println(myvar1)
	var myvar2 float32
	fmt.Println(myvar2)
	var myvar3 bool
	fmt.Println(myvar3)
}

func method3() {
	fmt.Println("<<<<<< Method3 >>>>>>>>>>.")
	///You can define all varibles at once
	var i, j, k, l int
	var c, ch byte
	var f, salary float32

	fmt.Println(i + j + k + l)
	fmt.Println(c + ch)
	fmt.Println(f + salary)

}

func method4() {
	fmt.Println("<<<<<< Method4 >>>>>>>>>>.")
	//Using short variable declaration:
	//This is used inside function
	// This is a local variables which are declared and initialize in the functions
	//Not applicabulr for global varible
	//are declared by using short variable declaration.

	d := "This is defined using the Short varible"
	fmt.Println(d)

}

func method5() {
	fmt.Println("<<<<<< Method 5 >>>>>>>>>>.")
	////Global varibles
	fmt.Println(myGlobalVar1)

	//Try to define this
	//d := "This is defined using the Global varible"
	//This will give an error.As it works only for localy
}

func main() {
	method1()
	method2()
	method3()
	method4()
	method5()
}
