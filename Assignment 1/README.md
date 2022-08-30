**Assignment 1**

**Due: Wednesday, September 7 at 5pm**

The goal of this assignment is to gain additional comfort with implementing interfaces in Java. 

First, you need to have Java installed on your machine and have a development environment that works for you. Lately, I have been writing my Java programs using Sublime (https://www.sublimetext.com), but you are very welcome to use any development tools that you like. (I expect that most of you have something that your comfortable working with based on your past experience with Java, and I would generally encourage you to use whatever is most familiar.) If you have any trouble getting Java up and running on the machine you are currently using, don't hesitate to reach out to me (mlepinski@ncf.edu)

**High Level:**

We will be starting with the simplest of data structures. We will create an object that holds a single letter. A program that uses this data structure will be able to request the letter either as a Java char or as a Java int. 

Note: For the int representation of a letter, we will use the ASCII character encoding. 
( https://en.wikipedia.org/wiki/ASCII ). If you use a Java type-casting to convert a char variable into an int variable, Java will use this character encoding. So to convert, you can just do something like:
       char  c   =  'X';
       int num  =  (int) c; 
      
**Detailed Instructions:**

For this initial assignment, you should work alone and submit code that you typed yourself. If you have any questions, please reach out to me (mlepinski@ncf.edu).

You can find the java file for the interface Letter in the course GitHub repository. 
( https://github.com/mlepinski/Data-Structures )

You MUST not alter the interface file

The GitHub repository also contains test code which you can use to ensure that your code is working properly. 

Please create two classes named LetterInt and LetterChar. Both of these classes should implement the Letter interface. However, LetterInt should internally store the letter data as an int, and LetterChar should internally store the letter data as a char. That is, to an outside observer, both classes do the same thing, but the internal implementation details will differ for the two classes. 

Additionally, when you construct LetterInt or LetterChar objects, please throw the IllegalArguementException if someone tries to construct a LetterInt or LetterChar that doesn't actually correspond to a letter. (For example, if someone tries to construct a LetterChar containing an exclamation mark, that is an exception … ! is not a letter.) The easiest way to check this is to note that the capital letters are between 65 (the letter "A") and 90 (the letter "Z"). Similarly, the lowercase letters are between 97 (letter "a") and 122 (letter "z"). 

After you have completed the assignment, please submit a zip file containing two java files:
     LetterInt.java
     LetterChar.java

Before you submit this assignment, please use the test code to make sure that your objects work. 

