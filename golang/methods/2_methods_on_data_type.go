/*Basic data stracture int ,string....*/
package main

import (
	"fmt"
)

/*Integer*/
type MyNumber int

func test1() {
	fmt.Println("<<<<<<<<<Methods and Integers data types>>>>>>>>>>")
	var num MyNumber = 12
	fmt.Println(num.isEvenNumber())
	num.incrementByOne()
	fmt.Println(num)
}

func (n MyNumber) isEvenNumber() bool {
	return (n % 2) == 0
}
func (n *MyNumber) incrementByOne() {
	/*We are using pointer.So actual argument changes*/
	*n = *n + 1
}

/*String*/
type MyString string

func test2() {
	fmt.Println("<<<<<<<<<Methods and String data types>>>>>>>>>>")
	var mtstr MyString = ""
	fmt.Println(mtstr.isEmpty())
}

func (s MyString) isEmpty() bool {
	if len(s) > 0 {
		return false
	} else {
		return true
	}
}

/*List*/
type MyList []int

func test3() {
	fmt.Println("<<<<<<<<<Methods and List data types>>>>>>>>>>")
	var list MyList = []int{1, 2, 3}
	list.print()
}
func (list MyList) print() {
	fmt.Printf("list: %v\n", list)
}

func main() {
	test1()
	test2()
	test3()
}
