
//IMPORTANT: This is just skeleton code to be helpful, you will need to change the main program to call timeStack() on a multiple large numbers to gain insight into how your data structure's performance scales.

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TimePartB{

    static long timeQueue( int n, Queue q){
	    
	//This gets the start time in nanoseconds
	long start = System.nanoTime();

	//Put 10 things in the Queue
        for(int i=0; i<10; i++){
	    q.enqueue(i);
	}

	//Add and Remove so the items in queue is never greater than 10
	for(int i=0; i < n; i++){
	    int item = q.dequeue();
	    q.enqueue(item);
	}

	//This gets the end time in nanoseconds
	long end = System.nanoTime();

	return end - start;
    }
    
    public static void main(String[] args) throws IOException{
	Queue test_q;
	long measurement;
	int size;
	BufferedWriter fastDataFile = new BufferedWriter( new FileWriter("fast_dataB.csv"));
	
	//------------------
	size = 500000;
	test_q = new Queue( new UnlimitedArrayFast() );
	measurement = timeQueue(size, test_q);
        fastDataFile.write("" + size + ", " + measurement);
	fastDataFile.newLine();
	//-----------------
	
	size = 1000000;
	test_q = new Queue( new UnlimitedArrayFast() );
	measurement = timeQueue(size, test_q);
        fastDataFile.write("" + size + ", " + measurement);
	fastDataFile.newLine();
	//-----------------

	fastDataFile.close();


	
	BufferedWriter circleDataFile = new BufferedWriter( new FileWriter("circle_dataB.csv"));
	
	//------------------
	size = 500000;
	test_q = new Queue( new UnlimitedArrayCircle() );
	measurement = timeQueue(size, test_q);
	circleDataFile.write("" + size + ", " + measurement);
	circleDataFile.newLine();
	//-----------------
	
	size = 1000000;
	test_q = new Queue( new UnlimitedArrayCircle() );
	measurement = timeQueue(size, test_q);
	circleDataFile.write("" + size + ", " + measurement);
	circleDataFile.newLine();
	//-----------------

	circleDataFile.close();
	
    }
}
	    
