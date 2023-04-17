package main

import (
	"fmt"
)

type Salary struct {
	amount int
}

//Value receiver
func (s Salary) increaseSalary1(increment int) int {
	s.amount = s.amount + increment
	return s.amount
}

//Pointer receiver
func (s *Salary) increaseSalary2(increment int) int {
	s.amount = s.amount + increment
	return s.amount
}

func main() {
	/*Value reciver*/
	salary1 := Salary{1200}
	temp := salary1.increaseSalary1(1000)
	fmt.Println(temp)
	fmt.Println(salary1.amount)
	/*pointer reciver*/
	salary2 := Salary{300}
	salary2.increaseSalary2(300)
	fmt.Println(salary2.amount)
}
