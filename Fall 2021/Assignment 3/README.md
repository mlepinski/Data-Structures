The goal of this assignment is to become more familiar with the LinkedList data structure

**High Level:**

I have provided you with an implementation of a SimpledLinked list that holds character data (one character per node in the list) and has a couple simple features. 

I would like you to EXTEND the SimpleLinked class to create a ComplexLinked list that has more features. 

Since you are using Java to extend the SimpleLinked class your new ComplexLinked class will inherit all of the methods/functions and attributes/variables from SimpleLinked. You MUST NOT change SimpleLinked, just create a new class that extends it and put all of your code into this new class. 


**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )









**Part A:**

In the GitHub you should find the classes SimpleLinked and Node. A Node stores a single character and the SimpleLinked list is made up of many nodes (one for each character in the list.) 

You should create a new class ComplexLinked that extends SimpleLinked. In addition to the methods/functions that are inherited from SimpleLinked, your new class should have the following methods:
void insert(int location, char data);
This function should insert the given character at a particular location in the list. 
Assume that the locations are numbered starting with 0

So insert(0, 'z') would add a 'z' character to the front of the list. 
insert(2, 'y') would add a 'y' character into position 2 of the list (which would be the third item). 

Inserting a new character should not change any other data in the list. So if you started with the list:
       A, B, C
and you did an insert(1, 'X')
then you should get:
      A, X, B, C

boolean remove(char data);
This function should remove the FIRST (and only the first) instance of the given character from the list. 

So remove('z') should find the first 'z' in the list and remove it.
If you find a 'z' and remove it, then return true

If there is no 'z' in the list, then the list should not be changed at all and the function should return false

The other data in the list should not be changed, so if you started with the list:
	A, B, C
and you did remove('B')
then you should get:
            A, C

ComplexLinked reverse();
This function should create a brand new ComplexLinked list that contains the same characters as the original list, but in the opposite order. 

So if the list, my_list contains:
     M, A, T, T
then my_list.reverse() should return a new list containing
      T, T, A, M


**Part B:**

There are many different ways that you might have implemented the reverse() function for your ComplexList. 

For this assignment, I don't care whether your solution was the fastest or the slowest way to reverse a list, but I do want you to analyze the runtime of your reverse() function.

Create a file PartB.txt and tell me what the worst-case runtime is for reversing a linked list with N items. You should use Big-Oh notation for this to describe the approximate rate of growth for large N. 
For example, is your approach O(1), O(N),  O( log(N) ),  O(2^N) ,  O(N^2),  O(N^3) … ??

You should also include an English language explanation for why your answer is correct. (For example, if the worst-case runtime of your reverse function is O(N^3), explain why it is O(N^3)? 


**Submission:**

After you have completed the assignment, please submit a zip file containing two files:
     ComplexLinked.java
     PartB.txt

