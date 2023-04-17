package main

import (
	"fmt"
)

func method1() {
	fmt.Println("<<<<<<<Method 1 >>>>>>>>>")
	i := 55
	j := 67.5
	//sum1 := i + j //int + float64 not allowed
	sum1 := i + int(j)
	fmt.Println(sum1)
}

func method2() {
	fmt.Println("<<<<<<<Method 2 >>>>>>>>>")
	i := 55
	j := 67.5
	var k float64 = float64(i)
	fmt.Println(i)
	sum2 := j + k
	fmt.Println(sum2)
}

func method3() {
	// character to ASCII
	char := 'a' // rune, not string
	ascii := int(char)
	fmt.Println(string(char), " : ", ascii)

	// ASCII to character

	asciiNum := 65 // Uppercase A
	character := string(asciiNum)
	fmt.Println(asciiNum, " : ", character)

}
func main() {
	method1()
	method2()
}
