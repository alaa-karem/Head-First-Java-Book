# Primitives and Reference
* ### used variables in two places:
    * ##### As object state (instance variables)
    * ##### As local variable
* ### There are 2 types of variables:
    * ##### First --> Primitive-Variables
        * This 8 types (int, short, long, byte, double, float, char, boolean)
    * ##### Second --> Reference-Variables
        * This anything except primitive variables as a Classes that specify the type of objects like
        (String, Scanner, or any custom class like student);
        
---

### How can you name variables?
* ##### It must start with a letter, underscore (_), or dollar sign ($). You can’t start a name with a number.   
* ##### After the first character, you can use numbers as  well. Just don’t start it with a number. 
* ##### It can be anything you like, subject to those two rules, just so long as it isn’t one of Java’s reserved words.

---
### Java is Pass by value?
* ##### Pass by value: 
    * ###### Pass by value: The method parameter values are copied to another variable and then the copied object is passed to the method. The method uses the copy
    * ###### Pass by reference: An alias or reference to the actual parameter is passed to the method. The method accesses the actual parameter.
---

```java
Book b = new Book();
Book c = new Book ();
b = c;
```
* Declare two Book reference variables and Create two new Book objects
* Assign the Book objects to the reference variables.
* The two book objects are now living on the heap...... Then,
    * Assign the value of variable c to variable b. 
      The bits inside variable c are copied, and 
      that new copy is stuffed into variable b. 
      Both variables hold identical values, and object 1 become Null 
  

