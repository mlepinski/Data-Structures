**Assignment #5**
**Due: Saturday, October 2 at 11:59pm**

This assignment is the culmination of our linked list work. You will be implementing a Skip List which is an order list that makes searching for items in the list quick and efficient. 

IMPORTANT: You MUST consult with a Teaching Assistant on this assignment (either in-person office hours or via email) BEFORE Wednesday the 29th. That is, the due date for this assignment is pushed until Friday, but you MUST start early and you MUST talk to one of the TA's.  

**High Level:**

I have provided you with some test code and an interface for a SearchList (a list that can be searched). You will write a SkipList class that implements the SearchList interface. 

IMPORTANT: Getting Insert and Search to work are the top goals for this assignment. If you don't get the remove function working, don't worry about it. (If you can get timing data for Insert and Search that you have succeeded in this assignment.)

You will likely want to write additional classes for your SkipList to use. For example, I do NOT provide you with a class for a SkipList node (something that stores one item in a SkipList). You are encouraged to consult the professor and the TA's if you want to discuss what classes would be helpful for you to write.

For this assignment, you will also need to do timing tests for your SkipList to see how efficient it is. I have provided you with some sample timing code, but you will need to modify this code in order to get timing data for the assignment. 










**Detailed Instructions:**

As indicated in the syllabus, you are welcome to collaborate and discuss these assignments with others in the class,  but everyone should submit their own code. Additionally, in a comment at the top of your files, please include:
-- Your Name
-- The names of anyone that you collaborated with
-- Any resources other than the textbook that were particularly helpful (Youtube videos, online examples, etc) 

You can find the code for in the course GitHub repository
( https://github.com/mlepinski/Data-Structures )


**Part A:**

Write a SkipList class that implements the SearchList interface. 

IMPORTANT: Initially you should focus on Insert and Search functions. After you finish the rest of the assignment, go back and try to write the remove function. 

Also, write any additional classes that your SkipList needs. 

Use the provided test code to make sure that your SkipList is working properly. 

**Part B:**

Please modify your code from Assignment #4 so that your OrderedLinked class implements the SearchList interface.

(Note: if you weren't able to get this code working for Assignment #4, please reach out to the professor and we can get you hooked up with correct code for the last assignment).


**Part C:**

Do some timing measurements to see how long it takes to insert N items into the array or to do N searches. (An individual search is probably fast enough that it may be difficult to get precise timing information, therefore, I recommend timing a bunch of searches … E.g., time a batch of N searches at once)

We expect that both insert and search should be O(log N) time. Therefore, if you time a sequence of N inserts, you would expect O(N log N ) time. Similarly, if you time a sequence of N searches you would expect O(N log N) time.
Collect some timing data for different values of N. Then graph  (runtime / N * Log(N) ). You would expect that this would approach a horizontal line as N gets large.

I have included a potentially useful function in the Timing class for gathering data. However, you will need to edit the Timing class to get the data that you need. (In particular, the main function currently is just gathering one data point and you will need multiple data points to see how the runtime changes as N grows.)

Finally, do similar timing measurements for your OrderedList class. You should find that this is dramatically slower than your SkipList timing. (In particular, insert and search should be O(n) each in the worst case, which means doing a batch of N will be O(N^2) time)

**Submission:**

After you have completed the assignment, please submit a zip file containing three files:
     SkipList.java
     OrderedLinked.java
     I file containing your graph/chart for Part C
