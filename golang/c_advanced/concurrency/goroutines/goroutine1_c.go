package main

import (
	"fmt"
)

func mygoroutine1() {
	fmt.Println("own  Function Go Routine")
}
func main() {
	go mygoroutine1()
	fmt.Scanln()
	fmt.Println("Main Function Go Routine")
}

/*
Actual Output and Expected output:
Main Function Go Routine
own  Function Go Routine

*/
