What is heap memory and stack memory in Java ?
In Java, heap memory and stack memory are two distinct areas where data is stored during the execution of a program. 
Here's a breakdown of their differences:

Heap Memory:
Purpose: Stores objects and their instance variables.
Lifetime: Objects are created on the heap and live as long as they are referenced by other objects or the program. 
Garbage collection automatically reclaims memory when objects are no longer in use.
Access: Objects on the heap can be accessed from anywhere in the program.
Size: The heap can grow dynamically as needed, limited only by the available system memory.

String name = "John";  // "John" is stored on the heap

Stack Memory:
Purpose: Stores method parameters, local variables, and method call information (e.g., return addresses).
Lifetime: Data on the stack is created when a method is called and destroyed when the method exits.
Access: Data on the stack is only accessible within the scope of the method it belongs to.
Size: The stack has a fixed size, determined when the thread is created.

Example:

   public void calculate() {
       int x = 10;   // x is stored on the stack
       int y = 20;  // y is stored on the stack
       int sum = x + y;  // sum is stored on the stack
   }
