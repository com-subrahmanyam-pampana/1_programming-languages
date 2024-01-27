package main

import (
	"fmt"
	"math"
)

/*
const declares a constant value.
reassignment not allowed
*/

const s string = "constant"

func constantsDeclarations() {

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
	const n = 500000000
	const d = 3e20 / n
	fmt.Println(int64(d))
	fmt.Println(math.Sin(n))

}
