package main

import "fmt"

func main() {

	const a = 20
	fmt.Println(a)
	const (
		name    = "John"
		age     = 50
		country = "Canada"
	)
	fmt.Println(name)
	fmt.Println(age)
	fmt.Println(country)
	//const a = 55 //allowed
	//a = 89 //reassignment not allowed
}
