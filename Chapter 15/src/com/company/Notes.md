
# networking and threads

### Socket:
##### represents a connection between two applications which may (or may not) be running on two different physical machines.

---

### A Socket connection means the two machines have information about each other, including network location (IP address) and TCP port

---

### TCP port:
##### A Socket represents a connection between two applications which may (or may not) be running on two different physical machines.

---

### Without port numbers:
##### the server would have no way of knowing which application a client wanted to connect to

---

### When you write a server program, you’ll include code that tells the program which port number you want it to run on

---
### what’s it take to write a server application?
##### Just a couple of Sockets.

---
### How does the server know how to communicate with the client?
##### The client knows the IP address and port number of the server

---

### #thread 
###### is a separate ‘thread of execution’. In other words, a separate call stack.

### #Thread 
###### is a Java class that represents a thread.

### #To make a thread, make a Thread.

---

### How to launch a new thread:
* ##### Make a Runnable object (the thread’s job)
* ##### Make a Thread object (the worker) and give it a Runnable (the job)
* ##### Start the Thread

---

### What does the thread deadlock happen ?
##### when you have two threads, both of  which are holding a key the other thread wants.