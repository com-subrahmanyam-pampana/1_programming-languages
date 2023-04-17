package main

import "fmt"

func method1() {
	fmt.Println("<<<<<<<<<<<<<<<<<<<<<Method 1>>>>>>>>>>>>>>")
	fmt.Println("Function with integer arguments")
	functionWithIntegerArgument(2)
	fmt.Println("Function with string arguments")
	functionWithStringArgument("Subbu")
	fmt.Println("Function with Map arguments")
	mymap := map[int]string{
		1: "subbu", 2: "gabbu",
	}
	functionWithMapArgument(mymap)
	fmt.Println("Function with Array arguments")
	x := []int{1, 2, 3}
	functionWithArrayArgument(x)
	fmt.Println("Function with Struct arguments")
	mystruct := struct {
		name string
		age  int
	}{
		name: "subbu",
		age:  12,
	}
	functionWithStructArgument(mystruct)
	fmt.Println("Function with channel arguments")
	/*   //Sending to channel
		func serve(ch <-chan SomeType) { //do stuff }
		//Writing to channel
	    func serve(ch chan<- SomeType) { //do stuff }
	*/
	myIntChannel := make(chan int)
	//We are sending data to vhannel
	go func() {
		myIntChannel <- 100
		myIntChannel <- 1000
		myIntChannel <- 10000
		myIntChannel <- 100000
	}()
	functionWithChannelArgument(myIntChannel)
}

func functionWithIntegerArgument(myvar int) {
	/*Syntax:
	  <varible's name> int
	*/
	fmt.Println(myvar)
}

func functionWithStringArgument(myvar string) {
	/*Syntax:
	  <varible's name > string
	*/
	fmt.Println(myvar)
}

func functionWithArrayArgument(myarray []int) {
	/*Syntax:
	  <varible's name> []dataDtype
	*/
	fmt.Println(myarray)
}
func functionWithMapArgument(myvar map[int]string) {
	/*Syntax:
	  <var name > map[<data type>]<data type>
	*/
	fmt.Println(myvar)
}

func functionWithStructArgument(myvar struct {
	name string
	age  int
}) {
	/*Syntax:
	  <var name > struct{}
	*/
	fmt.Println(myvar)
}
func functionWithChannelArgument(mychannel <-chan int) {
	/*Syntax: Receive channel
	func serve(mychannel <-chan SomeType) { //do stuff }
	*/
	//Get data from a channle and assign it to varible
	x := <-mychannel
	fmt.Println(x)
	y := <-mychannel
	fmt.Println(y)
	z := <-mychannel
	fmt.Println(z)
}

func method2() {
	fmt.Println("<<<<<<<<<<<<<<<<<< Method 2 :Return values>>>>>>>>>>>>>>>")
	var bill int = calculateBill(20, 4)
	fmt.Println(bill)
	addNumbers(1, 2, 3, 4)
	fmt.Println(" Return 2 values")
	sum, product := getProductAndSumOfNumbers(2, 3)
	fmt.Println(sum, product)
	/*You can use "_ ",if you don n't want to use varible */
	sum2, _ := getProductAndSumOfNumbers(2, 3)
	fmt.Println(sum2)
}

func calculateBill(price int, no int) int {
	var totalPrice = price * no
	return totalPrice
}

func addNumbers(num1, num2, num3, num4 int) int {
	var total = num1 + num2 + num3 + num4
	return total
}
func getProductAndSumOfNumbers(num1, num2 int) (int, int) {
	return (num1 + num2), (num1 * num2)
}

func getProductAndSumOfNumbers2(num1, num2 int) (sum, product int) {
	sum = (num1 + num2)
	product = (num1 * num2)
	return
}

func main() {
	method1()
	method2()
}
