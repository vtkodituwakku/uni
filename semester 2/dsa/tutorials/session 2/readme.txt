
1. What is a stack ?

Stack is an Abstract Data type that operates according to the LIFO principal. When a item is added to the stack it gets added to the top of the stack when an
element is also removed from the stack it also gets removed from the top of the stack. Stacks can be implemented with Arrays or Linked Lists.

A typical stack has methods such as Pop to remove the top most element from the stack, Add to an an element to the top of the stack and some other methods such as isFull,
Seek and etc...

2. Define Push, Pop, Peek, isEmpty is Stacks

Push - This method is used to add an element to the stack
Pop - This method is used to remove the top most element from the stack (The most recenly added element) (This method also removes the value form the stack)
Peek - This method is used to get the value of the top most element of the stack without removing it
isEmpty - This method is used to find out wether the stack is empty or not

3. Give 7 examples of stacks found in real life
  1. Stack of Books: When you place books on top of each other, you create a physical stack. The book you place last is the first one you can access or remove.
  2. Plate Stack: When you stack plates on top of each other in a cupboard, you can only access or remove the plate on the top of the stack.
  3. Call Stack: In programming, a call stack is used to manage function calls. Each time a function is called, information about the function and its variables is pushed onto the stack. When a function completes execution, it is popped off the stack, allowing the program to return to the previous function.
  4. Browser History: When you navigate through web pages in a browser, each page you visit is added to a stack-like structure called the browser history. You can use the back button to pop the top page and revisit the previously viewed pages.
  5. Undo/Redo Operations: Many software applications provide undo and redo functionality. Each action performed is stored in a stack, allowing you to undo or redo operations by popping and pushing actions onto the stack accordingly.
  6. Stack of Plates: In a cafeteria or buffet, plates are often stacked to save space. When someone takes a plate, they usually take it from the top of the stack, following the LIFO principle.
  7. Stack of Pancakes: When making a stack of pancakes, each new pancake is placed on top of the previous one. To serve or eat a pancake, you typically start from the top of the stack, removing the most recently cooked pancake.

4. How to find out wether a stack is empty in a program ?

We implement a method called isEmpty with the stack we can run this method on the stack to check wether the stack is empty or not
Implementing the isEmpty method will be different depending on the way the stack is implemented


