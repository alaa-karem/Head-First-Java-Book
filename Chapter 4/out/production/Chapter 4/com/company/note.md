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


