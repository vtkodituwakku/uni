
# Access modifiers

* There are 4 access modifiers in java language
  1. Private
  2. Public
  3. Protected
  4. Default (Package)

1. Private
  * The private members are accesible only within the class where it has been declared

2. Public
  * The public members are accessible from any part of the program (In or outside the class)

3. Protected
  * Protected memebers are accessible only to the immediate child class

4. Default
  * This allows data to be accesses anywhere from the same Package but not from a different Package


# Interface

* The java language does not support multiple inheritance it is acheived through interfaces
* An interface contains constant variables and method prototypes
  eg :-
  
  ```
  interface FindArea {
    final float pi = 3.14;
    public void calArea();
  }

  class Circle implements FindArea {
    public void calArea() {
      // Logic to calculate the area
    }
  }
  ```

# Abstract class and Abstract method

  * The abstract class is similar to the interface but the abstract class can contain methods with body and methods without implementation

  * The astract class must alleast contain at least one abstract method



