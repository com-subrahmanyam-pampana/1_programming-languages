package main

import (
	"fmt"
)

func mygoroutine() {
	fmt.Println("own  Function Go Routine")
}
func main() {
	/*We are creating a coroutine using "go" keyword before function*/
	go mygoroutine()
	fmt.Println("Main Function Go Routine")
}

/*

Actual Output:
Main Function Go Routine

Expected output:
Main Function Go Routine
own  Function Go Routine

Reason:Main is not waiting
*/
