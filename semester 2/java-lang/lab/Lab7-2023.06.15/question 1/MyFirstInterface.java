public interface MyFirstInterface {
  int x = 0;

  void display();
}

// 1. Try to declare the variable with/without public static final keywords. Is there any difference
// between these two approaches? Why?
// No. Interfaces in java can only store constants therfore wether you say it or not every variable
// that you define should be initialized
// doing so will make the variables implicity public, static and final so that the above variable
// cannot be changed again

// 2. Declare the abstract method with/without abstract keyword. Is there any difference between
// these two approaches? Why?
// interfaces in java is always abstract wether you say explicitly or not so making the methods
// inside the interface abstract does not cahnge
// anything.
// This is because interfaces or abstract classes cannot be used directly to create objects
// Abstract classes should be inherited and interfaces should be implemented in order to create an
// object

// 3.Implement this into a class called “IntefaceImplemented” . Override all the abstract methods.
// Try to change the value of x inside this method and print the value of x. Is it possible for you
// to change x? why?
// This triggers a compilation error because when the final modifier is present a method cannot be
// overwritten
// or the value of a variable cannot be cahnged
