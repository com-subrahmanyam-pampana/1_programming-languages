package main

import (
	"fmt"
	"sort"
)

func sliceAndArray() {
	/*For aray we defined the size initially*/
	var myarray [2]int
	myarray = [2]int{1, 2}
	//myarray = [2]int{1, 2, 3}
	//myarray = [3]int{1, 2}
	fmt.Println(myarray)

	/*For slice  we  don't defined the size initially*/
	var myslice []int
	myslice = []int{1, 2, 3, 4, 5}
	myslice = []int{1, 2, 3, 4, 5, 6}
	fmt.Println(myslice)
}

func slice1() {
	/*Createing using literal*/
	var myslice []int
	myslice = []int{1, 2, 3, 4, 5}
	myslice = []int{1, 2, 3, 4, 5, 6}
	fmt.Println(myslice)
	/*Using shorthand*/
	myslice2 := []int{1, 2, 3}
	fmt.Println(myslice2)
	/*Using make function*/
	var myslice3 = make([]int, 3)
	myslice3 = []int{1, 2, 3, 4, 5}
	fmt.Println(myslice3)

}
func sliceFromAnArray() {
	var a = [7]int{1, 2, 3, 4, 5, 6, 7}
	var slice1 []int = a[:]
	fmt.Println(slice1)
	var slice2 []int = a[0:3]
	fmt.Println(slice2)
	var slice3 []int = a[:3]
	fmt.Println(slice3)
	var slice4 []int = a[:4]
	fmt.Println(slice4)

}
func sortSlice() {
	myslice := []int{5, 4, 3, 2, 1}
	sort.Ints(myslice)
	fmt.Println(myslice)
	myslice2 := []string{"e", "d", "c", "b", "a"}
	sort.Strings(myslice2)
	fmt.Println(myslice2)
}
func searchSlice() {
	myslice := []int{5, 4, 3, 2, 1}
	fmt.Println(sort.SearchInts(myslice, 3))
}

func reverseSlice() {
	myslice := []int{5, 4, 3, 2, 1}
	fmt.Println(sort.Reverse(sort.IntSlice(myslice)))
}

func iterateSlices() {
	d := []int{12, 78, 50}
	e := []string{"US", "UK", "India", "USSR"}

	for i := 0; i < len(d); i++ {
		fmt.Printf(" index = %d and value is %d \n", i, d[i])
	}
	fmt.Println("......Using Range.....")
	/*Using Range*/
	for index, value := range e {
		fmt.Printf(" index = %d and value is %s \n", index, value)
	}
	/*Using Range*/
	for index, value := range e {
		fmt.Printf(" index = %d and value is %s \n", index, value)
	}
}

func listOfStructs() {
	type student struct {
		no   int
		name string
	}
	students := []student{{1, "subbu"}, {2, "jaffa"}}
	fmt.Println(students)

}
func main() {
	searchSlice()
}
