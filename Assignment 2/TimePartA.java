
//IMPORTANT: This is just skeleton code to be helpful, you will need to change the main program to call timeStack() on a multiple large numbers to gain insight into how your data structure's performance scales.

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TimePartA{

    static long timeStack( int n, Stack st){

	//This gets the start time in nanoseconds
	long start = System.nanoTime();
	
	for(int i=0; i < n; i++){
	    st.push(i);
	}
	
	while( !st.isEmpty() ){
	    st.pop();
	}

	//This gets the end time in nanoseconds
	long end = System.nanoTime();

	return end - start;
    }

    static long timeQueue( int n, Queue q){
	    
	//This gets the start time in nanoseconds
	long start = System.nanoTime();
	
	for(int i=0; i < n; i++){
	    q.enqueue(i);
	}

	while( ! q.isEmpty()){
	    q.dequeue();
	}

	//This gets the end time in nanoseconds
	long end = System.nanoTime();

	return end - start;
    }
    
    public static void main(String[] args) throws IOException{
	Stack test_st;
	long measurement;
	int size;
	BufferedWriter slowDataFile = new BufferedWriter( new FileWriter("slow_data.csv"));
	
	//------------------
	size = 100000;
	test_st = new Stack( new UnlimitedArraySlow() );
	measurement = timeStack(size, test_st);
	slowDataFile.write("" + size + ", " + measurement);
	slowDataFile.newLine();
	//-----------------
	
	size = 200000;
	test_st = new Stack( new UnlimitedArraySlow() );
	measurement = timeStack(size, test_st);
	slowDataFile.write("" + size + ", " + measurement);
	slowDataFile.newLine();
	//-----------------

	slowDataFile.close();


	
	BufferedWriter fastDataFile = new BufferedWriter( new FileWriter("fast_data.csv"));
	//------------------
	size = 100000;
	test_st = new Stack( new UnlimitedArrayFast() );
	measurement = timeStack(size, test_st);
	fastDataFile.write("" + size + ", " + measurement);
	fastDataFile.newLine();
	//-----------------
	
	size = 200000;
	test_st = new Stack( new UnlimitedArrayFast() );
	measurement = timeStack(size, test_st);
	fastDataFile.write("" + size + ", " + measurement);
	fastDataFile.newLine();
	//-----------------

	fastDataFile.close();
	
    }
}
	    
