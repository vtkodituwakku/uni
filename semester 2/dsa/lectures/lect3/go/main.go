// Stack implementation with arrays
package main

import (
	"fmt"
	"log"
)

type stack struct {
	top int
	arr [5]int
}

func (s *stack) init() {
	s.top = -1
}

func (s *stack) push(value int) {
	s.top++
	if s.top > 5 {
		log.Fatal("The stack is full")
	}

	s.arr[s.top] = value
}

func main() {
	s1 := stack{}
	s1.init()

	s1.push(2)
	s1.push(3)

	fmt.Println(s1.arr, s1.top)
}
