
//IMPORTANT: This is just skeleton code to be helpful, you will need to change the main program to call timeInsert() and timeSearch() on a multiple large numbers to gain insight into how your data structure's performance scales.

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

public class Timing{

    static long timeSearch( int n, SearchList<Integer> lst){

       	Random rand = new Random();

	//Build the list, but don't time this part
	for(int i=0; i < n; i++){
	    Integer data = new Integer(rand.nextInt());
	    lst.insert(data);
	}

	
	//This gets the start time in nanoseconds
	long start = System.nanoTime();
	
	for(int i=0; i < n; i++){
	    Integer data = new Integer(rand.nextInt());
	    lst.search(data);
	}

	//This gets the end time in nanoseconds
	long end = System.nanoTime();

	return end - start;
    }

    static long timeInsert( int n, SearchList<Integer> lst){
	Random rand = new Random();

	
	//This gets the start time in nanoseconds
	long start = System.nanoTime();
	
	for(int i=0; i < n; i++){
	    Integer data = new Integer(rand.nextInt());
	    lst.insert(data);
	}

	//This gets the end time in nanoseconds
	long end = System.nanoTime();

	return end - start;
    }
    
    public static void main(String[] args) throws IOException{
	SearchList s_list;
	long measurement;
	int size;
	BufferedWriter dataFile = new BufferedWriter( new FileWriter("data_file.csv"));
	
	//------------------
	size = 100000;
	s_list = new SkipList<Integer>( );
	measurement = timeInsert(size, s_list);
	dataFile.write("" + size + ", " + measurement);
	dataFile.newLine();

	dataFile.close();

	
    }
}
	    
