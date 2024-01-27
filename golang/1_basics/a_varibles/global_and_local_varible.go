package main

import "fmt"

var myGlobalVar1 int

func globalAndLocalVarible() {

	////Global varibles
	fmt.Println(myGlobalVar1)

	//Try to define this
	//d := "This is defined using the Global varible"
	//This will give an error.As it works only for localy
}
