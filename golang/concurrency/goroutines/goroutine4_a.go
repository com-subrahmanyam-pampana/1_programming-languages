package main

import (
	"fmt"
	"time"
)

func main() {
	start := time.Now()
	go func() {
		for i := 0; i < 3; i++ {
			fmt.Println(i)
		}
	}()

	go func() {
		for i := 0; i < 3; i++ {
			fmt.Println(i)
		}
	}()

	elapsedTime := time.Since(start)

	fmt.Println("Total Time For Execution: " + elapsedTime.String())

	time.Sleep(time.Second)
}

/*
The above code executes two self-executing functions
inside a Golang main function, sequentially.
We are not using any Goroutine and the program
is executed in the same thread. We haven’t added any
 concurrency to the application. Upon execution, we get the following output:
*/
