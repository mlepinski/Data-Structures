// This data structure stores a sequence of integers of arbitrary length
// It supports adding elements to the back-end of the sequence
// ... and removing elements from either the front or the back of the sequence


// IMPORTANT: Please include a constructor that takes no input
//          and creates an empty sequence with no data

public interface UnlimitedArray{

    //isEmpty() should reutrn true if there are no integers 
    //       currently stored in the data structure
    //       i.e., every int added has been removed
    //The function should return false otherwise
    public boolean isEmpty();
    
    //getFirst returns the integer which is the first number in the sequence
    // ... This DOES NOT change the data in the data structure
    //Note: This is looking at the item that is least-recently added
    public int getFirst();

    //getLast returns the integer which is the last number in the sequence
    // ... This DOES NOT change the data in the data structure
    //Note: This is looking at the most-recently added number
    public int  getLast();

    //This adds a new number to the end [back-end] of the sequence
    public void add(int number);

    //This removes and returns the first number in the sequence
    //Note: This will be the least-recently added number
    public int removeFirst();

    //This removes and returns the last number in the sequence
    //Note: This will be the most-recently added number
    public int removeLast();

}
