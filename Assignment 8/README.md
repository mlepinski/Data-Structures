**Assignment #8**

**Due: Friday, November 19 at 11:59pm**

In this assignment we look at a heap as an efficient way of storing data so that the maximum value is always readily available. We often refer to a data structure that makes it easy to find and remove the largest [highest priority] item as a "Priority Queue"

**High Level:**

I have provided you with an outline of a GenericMaxHeap class that is able to store any data of any type that implements Java's Comparable interface.

We use an ArrayList to store the items in heap. The ArrayList is essentially "simulating" a tree structure. 

Chapter 10.1 in the Open Data Structures text has helpful information about Heaps and using an array to simulate a tree structure. 

If we were purists, we could use an array instead of an ArrayList, but I chose an ArrayList for this assignment because then the ArrayList class will take care of the re-sizing (as more data gets added) and you don't need to worry about that detail.

In this assignment, you will need to write functions to insert a new item into the heap and also a function that removes the maximum item from the heap. We will then test the data structure by creating a simple class that implements the Comparable interface.















**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )


**Part A:**

Create a simple class called Task. This class should contain a String which is a description of the task. (E.g., "Do Data Structures Assignment") 

Additionally, the Task should contain a number which is the priority of the task. (E.g., How important/urgent is it to complete the given task?) The Task class should implement the Comparable interface and comparing two tasks should be accomplished by comparing their priorities. 


**Part B:**

Implement the insert function in the GenericMaxHeap class.

This function takes in an item of data and inserts it into the heap in a way that maintains the heap property. (That is, every data item needs to be larger than each of its children)


**Part C:**

Implement the removeMax function in the GenericMaxHeap class.

This function should return the largest item of data in the heap and then remove this item from the heap. The function should make sure that the heap property is maintained after removal. (That is, every data item needs to be larger than each of its children)




**Part D:**

Create a class TestHeap that tests your GenericMaxHeap by doing the following:
Create an empty heap
Add a bunch of Tasks to the heap with a variety of different priorities
Note: Do not insert the items in sorted order
Repeatedly remove the maximum priority task from the heap
Print out the removed task to verify that they are leaving the heap in priority order

**Submission:**

After you have completed the assignment, please submit a zip file containing:

* GenericMaxHeap.java  
* Task.java
* TestHeap.java
