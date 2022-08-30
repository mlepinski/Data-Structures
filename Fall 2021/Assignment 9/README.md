**Assignment #9 (The last assignment)**
**Due: Friday, Dec. 3rd**


In this assignment, we are exploring Hash Tables as an efficient way to implement a Dictionary. 

**High Level:** 

I have provided you with a Dictionary interface that specifies two functions: insert and lookup. 

The Dictionary uses Strings as the key, but allows you to associate a key with a value of any type. (So you could make a dictionary that stores Integers, or Strings or any class that you create.)

Your goal for this assignment is to create a HashTable class that implements the Dictionary interface.

Chapter 5.1 in the Open Data Structures text has helpful information about Hash Tables.  (https://opendatastructures.org/ods-java/ )

**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )


**Part A:**

Create a Node class that stores a key (a String) and a value (which can be any type). 

The idea is that when someone wants to store a key, value pair in your HashTable, you will create a node and store it in the HashTable.

**Part B:** 

Create a HashTable that implements the Dictionary interface.

You are allowed to use ArrayLists (or LinkedLists) if that is convenient for you. We know from past assignments how to implement these data structures. 

Your HashTable should be an array of lists where the list stores Node objects. (The reason that you need an array of lists is because -- rarely -- you may get a collision in your hash function which causes two items to end up in the same location in your array.)

To figure out which slot (in the array) an item belongs in, you are free to use any hash function. However, I recommend (for simplicity) using the Java String class's built-in hashCode() function. 

Note: The Java hashCode() function returns a long (integer) and so you will need to use the mod operator ( % ) to reduce the value to something between 0 and the size of your array. 

**Submission:**

After you have completed the assignment, please submit a zip file containing:
     Node.java
     HashTable.java
 
