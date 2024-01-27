package main

import "fmt"

func primitiveDataTypesInGo() {
	/*Integer*/
	var myint1 int = -12     /*signed integer=holds both +ve and -ve values*/
	var myint2 uint = 2      /*unsignes=Holds only positive values*/
	var myint3 int64 = 34566 /*64 bits (8 bytes)*/
	var myint4 int32 = 23    /*32 bits (4 bytes)*/
	var myint5 int16 = 2     /*16 bits (2 bytes)*/
	fmt.Println(myint1, myint2, myint3, myint4, myint5)

	/*Float*/
	var myFloatVar1 float64 = 5676.33
	var myFloatVar2 float32 = 2.3
	fmt.Println("float64", myFloatVar1, "float64", myFloatVar2)

	/*String */
	var message string = "Hello World"  //double quotes
	var message2 string = `Hello World` //backticks
	fmt.Println(message, message2)

	/*Boolean*/
	var mybool1 bool = true
	mybool2 := false
	fmt.Println("mybool1", mybool1, "b:", mybool2)
	/*Complex numbers*/
	var myComplexNumber complex64 = 6 + 7i
	var myComplexNumber2 complex128 = 6 + 7i
	fmt.Println("myComplexNumber", myComplexNumber, myComplexNumber2)

	/*Rune*/
	//Rune literals are just 32-bit integer values
	//rune is a data type that stores codes that represent Unicode characters.
	var myrune1 rune = 'A'
	var myrune2 rune = '@'
	var myrune4 rune = '😀'
	fmt.Println("myrune1 = ", myrune1, "myrune2=", myrune2, "myrune4 😀 =", myrune4)

}

func compositeDataTypesInGo() {
	/*Array*/
	/*collection of similar types of data*/
	var myArray1 [3]int
	myArray1 = [3]int{1, 2, 3}
	var myArray2 [4]int = [4]int{1, 2, 3, 4} //specifying the size
	myArray3 := [2][2]int{{1, 2}, {3, 4}}    //2D array
	fmt.Print(myArray1, myArray2, myArray3)
	/*Slice*/
	/*Slice is a collection of similar types of data,
	just like arrays but without size defined while declarying*/
	var mySlice1 []int
	mySlice1 = []int{1, 2, 3}
	var mySlice2 []int = []int{1, 2, 3, 4} //specifying the size
	mySlice3 := [][]int{{1, 2}, {3, 4}}    //2D array
	fmt.Print(mySlice1, mySlice2, mySlice3)

	/*Map*/
	var subjectMarks map[string]float32 = map[string]float32{"Golang": 75.2, "Java": 70, "Python": 91}
	fmt.Print(subjectMarks)
	/*structs*/
	/*A struct is used to store variables of different data types*/
	type Student struct {
		name string
		age  int
	}
	var student1 Student = Student{"John", 25}
	fmt.Print(student1)

}

func pointersInGo() {

	/*A pointer holds the memory address of a value*/
	/*
		The type *T is a pointer to a T value. Its zero value is nil
	*/
	i, j := 42, 2701

	p := &i         // point to i
	fmt.Println(*p) // read i through the pointer
	*p = 21         // set i through the pointer
	fmt.Println(i)  // see the new value of i

	p = &j         // point to j
	*p = *p / 37   // divide j through the pointer
	fmt.Println(j) // see the new value of j

}

func nilTypeinGo() {
	/*
		nil in Go means a zero value for pointers, interfaces, maps, slices, and channels.
		It means the value is uninitialized
	*/
	var mySlice1 []int
	mySlice1 = nil
	fmt.Println(mySlice1)

	// var myint1 int ;
	// myint1=nil;//You can not assign nil to int vars

}
