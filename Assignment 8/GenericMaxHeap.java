//This class implements a heap (priority queue)
// ... The heap can store any comparable object
//For convenience we use an ArrayList
// ... The ArrayList implementation handles the re-sizing of the array
// ... which simplifies our code a bit

//This is a MaxHeap which means that the largest value is stored in the root
//... and the value at a node is Larger than the values of its children

import java.util.ArrayList;

public class GenericMaxHeap<T extends Comparable>{

    ArrayList<T> data;
    int size;

    //These functions take in an index (a location in the array)
    //... and return the index (location) of the left/right child
    int left(int index) {
        return 2*index + 1;
    }
    int right(int index) {
        return 2*index + 2;
    }

    //This functions take in an index (a location in the array)
    //... and return the index (location) of the parent
    int parent(int index) {
        return (index-1)/2;
    }

    //This function takes 
    public void insert(T new_data){
    }

    //This function returns the largest item in the heap
    //This function does not change the heap
    public T getMax(){
	return this.data.get(0);
    }

    //This function removes the largest item from the heap
    //This function then returns that item
    public T removeMax(){

	//Don't return null, change this line!
	return null;
    }
    
    public GenericMaxHeap(){
	size = 0;
	data = new ArrayList<T>();
    }

}
