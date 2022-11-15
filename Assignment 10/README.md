**Assignment #10**
**Due: Friday, November 25th at 11:59pm**

In this assignment we look at the balancing of binary trees. In particular, you will implement a Scapegoat tree as an example of a self-balancing tree. 

Scapegoat trees are described in detail in chapter 8 of the textbook (https://opendatastructures.org/)

**High Level:**

I have provided you with a simple implementation of a binary search tree for integer (int) data. This implementation helpfully keeps track of the height and size of each node. (That is, if you consider the current node to be its own binary tree, how tall and large is that binary tree.) 

You will first explore the creation of very "unbalanced" binary search trees. These are trees where the height is much taller than it needs to be in order to hold the given data. For example, a tree with 256 values could be around height 8 if it is nicely balanced. However, depending on the order in which the values are inserted into the binary search tree, it could end up having a height of 100 or more!

You will then implement a Scapegoat tree which has a different insertion mechanism that ensures the tree stays roughly balanced as nodes are inserted. 

Finally, you will obtain some timing data to see if your scapegoat tree is faster than the regular binary search tree. (You should find that if you are going to be doing a lot of searching in the tree, that the work that the scapegoat tree does to maintain a rough balance is well worth it.)















**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )


**Part A:**

Write a function (in the Test class) that inserts 1000 integers into an IntSearchTree in order. (That is, you insert the smallest integer first and then the rest of the integers in increasing order.)

Create a textfile called readme.txt that tells me what heights you obtained. 


**Part B:**

Create a Java ArrayList that contains 1000 integers. Use the function Collections.shuffle() to randomly order this array list. 

Note: If my_list is an ArrayList then running the function:
     Collections.shuffle(my_list)
Will result in the ArrayList having its order randomized.

Find the height of the resulting tree. Repeat this a couple times (We repeat a couple of times because due to randomness there could be some variation in the values. You should find that these heights are much smaller than in Part A.)

Put the heights that you get in your readme.txt file.


**Part C:**

Initially, the IntScapegoat class is identical to the IntSearchTree class. Now you will add the code to keep it balanced. (This will involve changing the insert method.)

After you do an insert, walk up the tree (from the leaf that you just inserted) and see if you can find a scapegoat. (A node whose sub-tree is too tall given the number of nodes that it contains). 

In particular, try to find a scapegoat where:
      1.5^Height - 1 > Number_of_nodes in the subtree

Recall that for a perfectly balanced tree:
      2^Height - 1 = Number_of_nodes

Therefore, if the number of nodes falls below 1.5^Height then we are very far from being balanced. 

We then re-balance by collecting all of the nodes in the sub-tree. (All of the descendents of the Scapegoat) and re-arranging them to be well balanced. 

There are several ways  that you can do this, but probably the easiest is to collect them into an ArrayList, shuffle them, and then insert them. (As we saw in Part B, shuffling the order that you insert will on average give you a pretty good balanced tree). Alternatively, the Open Datastructures textbook describes how you can build a perfectly balanced subtree. 

**Part D:**

Your IntScapegoat class implements IntDataSet as does the IntSearchTree.

Do some timing measurements (add code to the Test class) to see if searching your IntScapegoal is faster than searching an IntSearchTree. 
Does the balancing lead to faster searches? 
Is there a significant difference in the time to create the tree? (Do all of the insertions?)

Note: The worst case for the IntSearchTree is when all of the nodes are inserted in order (as you saw in Part A you get a very tall tree when items are inserted in order). You should use this worst-case when comparing with your IntScapegoat tree.

Include a table that shows your timing measurements (in a separate file) and briefly describe your conclusions in readme.txt.

**Part E:***

I have provided an IntHashSet data structure that also implements the IntDataSet interface. The IntHashSet uses a Java HashSet (i.e., Hash Table) to store and search for data. 

Do the same timing measurements from Part D with the IntHashSet.

How does the run time for insert and searches compare between the IntHashSet and the binary tree classes?

**Submission:**

After you have completed the assignment, please submit a zip file containing:
     IntScapegoat.java
     Test.java
     A file that contains a table with your measurements from Part D and E
     readme.txt  (with the text answers for Parts A, B, D and E)

