**Assignment #4**
**Due: Wednesday, September 22 at 11:59pm**

The goal of this assignment is to gain familiarity working with doubly-linked lists and also with data structures that hold generic data. I would also like you to start to get experience writing your own test code for your Data Structures. 

IMPORTANT: You MUST also read Chapter 4.1 before class on Tuesday (Open Data Structures Book)

**High Level:**

I have provided you with an implementation of a DoubleLinked list that holds any time of data. 

I would like you to EXTEND DoubleLinked to create OrderedLinked which is a doubly-linked list where every data item is stored in order (from smallest to largest). 

You should be able to insert and remove items from OrderedLinked, while still keeping things in order. For this assignment, I am asking you to write some test cases to make sure that your code works.


**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )









**Part A:**

Create a file TestCases.txt

In this file list a series of operations that involve (in some order)
-- Create an empty list
-- Print the list
-- Remove an item from the list
-- Add an item to the list
-- Check and see if an item is present in the list

Also write down what you expect to happen when you run these steps. 

Ideally, you should include insert and remove commands that involve the middle of the list, but also that involve inserting or removing from one end of the list. 

**Part B:**

In the GitHub you should find the classes DoubleLinked and DNode. A DNode stores a single item of data that knows both the next and the previous DNode in the list. DoubleLinked list is made up of many DNodes (one for each piece of data in the list.) 

You should create a new class OrderedLinked that extends DoubleLinked. In addition to the methods/functions that are inherited from DoubleLinked, your new class should have the following methods:
void insert(T data);
This function should insert the given data item at the correct position in the list. Your list should remain in order after the insert so everything before the new data item should be LESS than the data you are inserting and everything after should be GREATER than (or equal to) to the data you are inserting.

Here, T is the type of data that your list stores. In both OrderedLinked and DoubleLinked, T should be comparable.

Note: Your list may contain duplicates and that is fine (if you are inserting a duplicate you can put it either before or after the other nodes with the same value)




boolean remove(T data);
This function should remove the FIRST (and only the first) instance of the given data from the list. 

If the data is not present in the list, then the list should not be changed at all and the function should return false

The remaining items in the list should remain in order after the removal takes place.


boolean search(T data);
This function should return true if there are one or more copies of the data present in the list. It should return false if there are no copies of the data present in the list.


**Part C:**

Create a new class TestOrderedLinked that implements the test cases that you described in your file TestCases.txt

Put comments in your file indicating what is supposed to happen in each step and what you expect to be printed to the screen.


Submission:

After you have completed the assignment, please submit a zip file containing two files:
     OrderedLinked.java
     TestOrderedLinked.java
     TestCases.txt



