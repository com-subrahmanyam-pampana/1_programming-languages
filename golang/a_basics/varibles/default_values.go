package main

import "fmt"

func defaultValuesOfVaribles() {

	//If we don not init the var values,it will take the default values
	var myvar1 int
	fmt.Println(myvar1) //0
	var myvar2 float32
	fmt.Println(myvar2) //0
	var myvar3 bool
	fmt.Println(myvar3) //false
}
