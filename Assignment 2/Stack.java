//This Data Structure implements a Stack of ints
//  Push adds an item to the Stack
//  Pop removes the most recently added item from the Stack
//FILO = First in, Last out

public class Stack{
    UnlimitedArray data;

    //This function returns true if the stack is empty
    public boolean isEmpty(){
	return data.isEmpty();
    }
    
    //Remove the most-recently added item from the Stack
    public int pop(){
	int item = data.removeLast();
	return item;
    }

    //Add a new item to the Stack
    public void push(int item){
	data.add(item);
    }

    //Peek does not change the data structure
    //Peek returns the next item that is ready to be pop'ed
    public int peek(){
	int item = data.getLast();
	return item;
    }

    //This constructor should be given an empty (new) UnlimitedArray
    public Stack(UnlimitedArray arr){
	data = arr;
    }
}
    
