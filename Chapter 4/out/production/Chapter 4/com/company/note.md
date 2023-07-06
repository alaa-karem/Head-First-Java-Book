# How objects behave
##### When you write a class, you’re describing how the JVM should make an object of that type
___
### Can every object of class type have different method behavior ?
##### Yeb, the methods can behave differently based on the value of the instance variables. 
___
### Can you send things to a method?
##### A method uses parameters
___
### Can you get things back from a method
##### Methods can return values. Every method is declared with a return type
___
### A method uses parameters. A caller passes arguments.
____

### Java is pass-by-value That means pass-by-copy...!!
##### The method can’t change the bits that were in the calling variable x
```java
/*
 int x = 7;
void go(int z){ }
void go(int z){
 z = 0; }       
 */
```
___

### Encapsulation:
##### I use ( setter and getter ), to protect data and protect right to modify the implementation later as data is hidden by access modifies (private and public)
___

### Is there a rule to do that?
* ##### mark your instance variables private
* ##### provide public getters and setters for access control.
___
### The difference between instance and local variables:
* ##### Instance --> variables are declared inside class but out the method.
```java
class Horse {
 private double height = 15.2;
 private String breed;
 // more code...
}
```
* ##### Local --> variables are declared inside class within method. 
```java
class AddThing {
 int a;
 int b = 12;
 public int add() {
 int total = a + b;
 return total;
 }
}
```
___



