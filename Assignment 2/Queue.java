//This Data Structure implements a Queue of ints
//  Enqueue adds an item to the Queue
//  Dequeue removes the least-recently added item from the Queue
//FIFO = First in, First out

public class Queue{
    UnlimitedArray data;

    //This function returns true if the Queue is empty
    public boolean isEmpty(){
	return data.isEmpty();
    }
    
    //Remove the least-recently added item from the Queue
    public int dequeue(){
	int item = data.removeFirst();
	return item;
    }

    //Add a new item to the Queue
    public void enqueue(int item){
	data.add(item);
    }

    //Peek does not change the data structure
    //Peek returns the next item that is ready to be dequeue'ed
    public int peek(){
	int item = data.getFirst();
	return item;
    }

    //This constructor should be given an empty (new) UnlimitedArray
    public Queue(UnlimitedArray arr){
	data = arr;
    }
}
