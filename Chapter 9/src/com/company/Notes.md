# Life and Death of an object
### Instance Variables:
##### Instance variables are variables declared inside a class but outside any method.
```java
public class Duck {
 int size;
}
```

### Local Variables:
##### Local variables are variables declared inside a method or method parameter. 
```java
public void foo(int x) {
 int i = x + 3;
 boolean b = true; 
}
```
---
* #### Java has two areas of memory we care about: the Stack and the Heap.
* #### All local variables live on the stack, in the frame corresponding to the method where the variables are declared
* #### All objects live in the heap, regardless of whether the reference is a local or instance variable
---
### The miracle of object creation:
* ##### Declare a reference variable  --->  Duck duck = new Duck()
* ##### Create an object
* ##### Link the object and the reference
###### We are not calling the method called Duck(), But We are calling the Duck constructor 
---
#### Constructors are not inherited.