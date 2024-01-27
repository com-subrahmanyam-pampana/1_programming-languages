package main

import (
	"fmt"
)

//Method vs Function:
/*Syntax:
  func(reciver_name Type) method_name(parameter_list)(return_type){
     // Code
   }
*/
//Method  contains a receiver  and function  does not contain a receiver.

type Rectangle struct {
	length  int
	breadth int
}

/*Function section starts */
func test1() {
	fmt.Println("<<<<<<<<<< Aread and Permeter : from Functions >>>>>>>>>>>>")
	/*We can calculate area and Permeter from functions*/
	rect := Rectangle{12, 13}
	area := area(rect)
	fmt.Print(area)
}
func area(r Rectangle) int {
	return r.breadth * r.length
}
func permeter(r Rectangle) int {
	return 2 * (r.length + r.breadth)
}

/*Method section*/
func test2() {
	fmt.Println("<<<<<<<<<< Aread and Permeter : from methods >>>>>>>>>>>>")
	/*We can calculate area and Permeter from functions*/
	rect := Rectangle{12, 13}
	area := rect.area()
	fmt.Print(area)
	permeter := rect.permeter()
	fmt.Print(permeter)
}
func (r Rectangle) area() int {
	return r.breadth * r.length
}
func (r Rectangle) permeter() int {
	return 2 * (r.length + r.breadth)
}

/*Method section ends */

func main() {
	test1()
	test2()
	/*Method 1 uses function and method 2 uses methods*/
	/*Both gives the same result*/
	/*
		 Go is not a pure object-oriented programming language and
		 it does not support classes. Hence methods on types are a way to
		 achieve behaviour similar to classes.
		Methods allow a logical grouping of behaviour
		related to a type similar to classes.
	*/
	/*We can group all Rectangle related methods like getArea,getPermiter,getColor etc
	 */
}
