One of the simplest way to handle exceptions is to use try catch block in a program

Example 1:-
Divide by zero exeption (ArithmaticException)

try {
    z = x/y;
} catch(Exception e) {
    System.out.println(e);
}

* In the above program Exception is a class name
* The main class of almost all the Exceptions is the Exception
* the "e" is an object created from a exception class
* A try block should contain atleast a one catch block
* It means 1 try block can contain more than 1 catch blocks

Example 2:-
The following examples generate 2 exceptions in that case 1 try block includes
more than 1 catch blocks
