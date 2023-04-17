package main

import (
	"fmt"
	"time"
)

func mygoroutine1() {
	fmt.Println("own  Function Go Routine")
}
func main() {
	go mygoroutine1()
	time.Sleep(1 * time.Second)
	fmt.Println("Main Function Go Routine")
}

/*
Actual Output and Expected output:
Main Function Go Routine
own  Function Go Routine

*/
