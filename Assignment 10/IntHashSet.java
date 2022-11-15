//This is an implementation of the IntHashSet interface using Java's HashSet class

//We discussed HashTables in class
//... and the built-in HashSet is basically another name for a HashTable
//... that supports fast inserts and searches

//HashMaps are a bit different because they are a dictionary of key/value pairs
//... But the implementation of a HashMap is very similar to a HashSet
//... Both involve an array and using a HashCode to determine where in the array to store the data

import java.util.HashSet;

public class IntHashSet implements IntDataSet{
    HashSet<Integer> data_set;
    
    public void insert(int value){
	data_set.add( Integer.valueOf(value) );
    }
    
    public boolean search(int target){
	return data_set.contains( Integer.valueOf(target) );
    }

    public IntHashSet(){
	data_set = new HashSet<Integer>();
    }
}
