# Interfaces and Abstract classes

###  An abstract class means the class must be extended; an abstract method means the method must be overridden.
###### Abstract class can't be instanced as:
```java
abstract public class Canine extends Animal 
{
    public void roam() { }
}

public class MakeCanine {
    public void go()
     {
        Canine c; 
        c = new Dog();        //This is OK, because you can always assign a subclass object to a superclass reference,even if the superclass is abstract.
        c = new Canine();    // class Canine is marked abstract, so the compiler will NOT let you do this
        c.roam();
     }
}
```
---

### An abstract class has virtually* no use, no value, no purpose in life, unless it is extended

---

### An abstract method has no body! 
```java
public abstract void eat();   //No method body! End it with a semicolon
```
###### If you declare an abstract method, you MUST mark the class abstract as well. But you can mix both abstract and non abstract methods in the abstract class.

---

* ### Your class can implement multiple interfaces.
* ### A class that implements an interface must implement all the methods of the interface, since all interface methods are implicitly public and abstract