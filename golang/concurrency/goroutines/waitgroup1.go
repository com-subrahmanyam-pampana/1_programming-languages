package main

import (
	"fmt"
	"sync"
)

func mygoroutine(myWaitGroup *sync.WaitGroup) {
	fmt.Println("own  Function Go Routine")
	myWaitGroup.Done()
}
func main() {
	var myWaitGroup sync.WaitGroup
	myWaitGroup.Add(1)
	go mygoroutine(&myWaitGroup)
	myWaitGroup.Wait()
	fmt.Println("Main Function Go Routine")
}
