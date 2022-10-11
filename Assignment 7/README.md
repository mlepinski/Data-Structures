**Assignment Week 7**
**Due: Wednesday, October 26 at 11:59pm**

This assignment is the beginning of our work on tree structures. In this assignment you will not be implementing a data structure. Instead you will be writing functions that use a tree class that I have created. **The focus of this assignment is modifying TreeUtilities.java to add additional functions.** 

You should start by running (the main function) in the TreeUtilities class. This main function has some example code, which may be helpful. 

**High Level:**

I have provided you with a simple implementation of a binary search tree for integer (int) data. This class is called IntSearchTree and it makes use of the IntNode class which stores a single int. 

Each IntNode stores a reference to its left child, its right child and its parent. The tree is organized so that if a particular int node stores a number (say 12) then everything in the left sub-tree (the left child and everything underneath the left child) is less than 12. Similarly, everything in the right sub-tree would be greater than or equal to 12. 

I have also created a class called TreeUtilities. This class is an abstract class (this means you are not able to create specific instances of TreeUtilities and it has no constructor) with only static methods. The static methods in this class are a collection of functions that make use of IntSearchTree. As an example, I include a method in this class that takes in an IntSearchTree and prints all of the data from the tree in order. 

For this assignment, you will be adding new static methods to the TreeUtilities class. You are welcome to make any changes you need to TreeUtilties, but please do not make changes to IntNode or IntSearchTree.



**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )


**Part A:**

Add the following function to the TreeUtilities class:
	public static int getMax(IntSearchTree  the_tree)

This function should return the largest integer stored in the_tree.


**Part B:**

Add the following function to the TreeUtilities class:
	public static int getNodeHeight(IntSearchTree  the_tree, int target)

The height of a node is the number of nodes that you pass through if you are traveling from the root to the node in the tree. (Here we count both the root and the destination node.) In particular, the height of the root node is 1. The height of the children of the root node is 2. The height of the grandchildren of the root is 3, and so on.

This function should find the first (left-most) node that stores the target integer. The node should then return the height of that node. If the target integer is not found in the tree, return -1.


**Part C:**

How would you test your getNodeHeight() function to make sure that it works correctly? 

Please explain your testing methodology and put that explanation in a file named readme.txt. 

You should write any code necessary to thoroughly test the correctness of your getNodeHeight() function.


**Part D:**

Add the following function to the TreeUtilities class:
	public static int getTreeHeight(IntSearchTree  the_tree)

This function should return the height (see Part B) of the node furthest from the root. If the tree only contains a root (with no children) then the height of the tree is 1. If the root has at least one child but no grandchildren, then the height of the tree is 2. Similarly, if the root has at least one grandchild but no great-grandchildren then the height of the tree is 3.

Note: This getTreeHeight function should only care about the leaf node furthest down from the root. (It doesn't matter how many grandchildren the root has, only whether it has grandchildren)

**Part E:** 

Add the following function to the TreeUtilities class:
	public static int getNextInt(IntSearchTree  the_tree, int target)

This function should find the (left-most copy of) the target  integer in the tree and then return the next largest integer in the tree. (If there are multiple copies of an integer in the tree, you should return the target integer itself … The second copy of the integer comes after the first copy.)

If the target integer is not in the tree or if the integer is the last item in the tree, this is an error and you should throw a RuntimeException.

**Part F:** 

Test your solutions for part D and E thoroughly. Include in your submission any code that you wrote to help test these functions and make sure they work correctly. 


**Submission:**

After you have completed the assignment, please submit a zip file containing:
     TreeUtilities.java
     Any other Java files that were helpful in testing
     readme.txt  (with the answer for Part C)
