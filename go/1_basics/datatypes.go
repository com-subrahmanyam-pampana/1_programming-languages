package main

import "fmt"

func main() {
	/*Integer*/
	var myint1 int = 0
	myint2 := 2
	var myint3 int64 = 0
	fmt.Println(myint1 + myint2)
	fmt.Println(myint3)
	/*Boolean*/
	a := true
	b := false
	c := a || b
	fmt.Println("a:", a, "b:", b, "c:", c)
	/*Float*/
	var salary float64
	salary = 5676.3
	d, e := 5.67, 8.97
	fmt.Println("d", d, "e", e)
	fmt.Println(salary)
	/*Complex numbers*/
	f := 6 + 7i
	fmt.Println("f", f)
	/*String */
	var message string = "Hello World "
	fmt.Println(message)
	/*Rune*/
	//Rune literals are just 32-bit integer values
	//Rune is something like char.Eg rune value for 1 os 65
	fmt.Println(SwapRune('a'))

	/*Composite data types*/
	var myArray []int = []int{}
	myArray = []int{1, 2, 3}
	fmt.Print(myArray)

}
func SwapRune(r rune) rune {
	switch {
	case 97 <= r && r <= 122:
		return r - 32
	case 65 <= r && r <= 90:
		return r + 32
	default:
		return r
	}
}
