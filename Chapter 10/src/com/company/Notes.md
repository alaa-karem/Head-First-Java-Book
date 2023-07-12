# Numbers Matter
### round() method:
##### rounds a floating point number to the nearest integer.

* ##### The only value that changes the way the round() method runs is the argument passed to the method!
* ##### If you try to make an instance of class Math: shows errors that the Math constructor is marked private! 
---
### The difference between regular (non-static) and static methods
#### A static method means: 
###### behavior not dependent on an instance variable, so no instance/object

##### #Regular:
###### Call a regular method using a reference variable name
```java
public class Song {
    String title;
    public Song(String t) {
        title = t;
    }
    public void play() {
        SoundPlayer player = new SoundPlayer();
        player.playSound(title);
 }  

```
##### #Static:
###### Call a static method using a class name
```java
public static int min(int a, int b){
 //returns the lesser of a and b
}
Math.min(42,36);

```

---
### method marked private means:
###### only code from within the class can invoke the method

### constructor marked private means:
###### only code from within the class can invoke the constructor

### Nobody can say ‘new’ from outside the class

---
### Static methods run without knowing about any particular instance of the static method’s class

---

* ### instance variables: 1 per instance 
* ### static variables: 1 per class
* ### Static variables are initialized when a class is loaded.
* ### Static variables in a class are initialized before any static method of the class runs
* ### A final variable means you can’t change its value.
* ### A final method means you can’t override the method.
* ### A final class means you can’t extend the class (i.e. you can’t make a subclass).

