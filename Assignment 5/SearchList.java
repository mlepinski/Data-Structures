//This is an interface for a search-able list

//Additionally, classes that implement this interface should have
// a contructor that takes in no inputs and creates an empty data structure

public interface SearchList<T extends Comparable>{

    //This function adds a new data item to the list
    public void insert(T the_data);

    //This function returns true if the particular data item in the list
    //This function returns false if no matching list element is found
    //This function should not change the data structure
    public boolean search(T the_data);

    //This function removes one copy of the given data from the list
    //It should return true if the remove is successful
    //It should return false if there is no matching list element to remove
    public boolean remove(T the_data);

    //This function prints out the contents of the list
    //The data in the list should be printed in order
    public void print();

    
}
