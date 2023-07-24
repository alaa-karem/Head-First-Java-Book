# serialization and file I/O

### You can save an object’s state by serializing the object

---

### To serialize an object, you need an ObjectOutputStream (from the java.io package)

---

* ### If your data will be used by only the Java program that generated it:
    ##### Use serialization
    ###### Write a file that holds flattened (serialized) objects. Then have your program read the serialized objects from the file and inflate them back into living, breathing, heap-inhabiting objects.
* ### If your data will be used by other programs:
    ##### Write a plain text file
    ###### Write a file, with delimiters that other programs can parse. For example, a tab-delimited file that a spreadsheet or database application can use.

---

### Writing a serialized object to a file
* #### Make a FileOutputStream
* #### Make an ObjectOutputStream
* #### Write the object
* #### Close the ObjectOutputStream
---
### When an object is serialized, all the objects it refers to from instance variables are also serialized. And all the objects those objects refer to are serialized. And all the objects those objects refer to are serialized...

---
### The Serializable interface is known as a marker or tag interface:
##### because the interface doesn’t have any methods to implement

---
### What happens during deserialization?
##### When an object is deserialized, the JVM attempts to bring the object back to life by making a new object on the heap that has the same state the serialized object had at the time it was serialized
* ##### 1- The object is read from the stream.
* ##### 2- The JVM determines (through info stored with the serialized object) the object’s class type.
* ##### 3- The JVM attempts to find and load the object’s class. If the JVM can’t find and/or load the class, the JVM throws an exception and the deserialization fails.
* ##### 4- A new object is given space on the heap, but the serialized object’s constructor does NOT run! Obviously, if the constructor ran, it would restore the state of the object back to its original ‘new’ state, and that’s not what we want. We want the object to be restored to the state it had when it was serialized, not when it was first created.
* ##### 5- If the object has a non-serializable class somewhere up its inheritance tree, the constructor for that non-serializable class will run along with any constructors above that (even if they’re serializable). Once the constructor chaining begins, you can’t stop it, which means all superclasses, beginning with the first non-serializable one, will reinitialize their state.
* ##### 6- The object’s instance variables are given the values from the serialized state. Transient variables are given a value of null for object references and defaults (0, false, etc.) for primitives
