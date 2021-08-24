import java.util.List;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.RuntimeException;

//IMPORTANT: Note that the processLetters function doesn't need to care at all about which implementation of a Letter is being used. 

public class Test1{

    //This function prints the letters in the input list
    //... alternating between character and integer representation
    static void processLetters( List<Letter> lst ){
	System.out.println("");
	System.out.println("-------------");
	System.out.println("Printing Letters Now:");

	boolean isChar = true; 
	
	for( Letter l : lst ){
	    if( isChar ){
		System.out.println(l.getChar());
	    }
	    else{
		System.out.println(l.getInt());
	    }
	    isChar = ! isChar;
	}
    }

    public static void main(String[] args){
	List<Letter> my_list = new ArrayList<Letter>();

	my_list.add( new LetterChar('A') );
	my_list.add( new LetterChar('B') );
	my_list.add( new LetterInt(89) );
	my_list.add( new LetterInt(90) );

	try{
	    my_list.add( new LetterChar('%') );
	}
	catch(RuntimeException e){
	    System.out.println("Correctly handled % error");
	}

	try{
	    my_list.add( new LetterInt(93) );
	}
	catch(RuntimeException e){
	    System.out.println("Correctly handled 93 error");
	}

	try{
	    my_list.add( new LetterChar('m') );
	}
	catch(RuntimeException e){
	    System.out.println("This Shouldn't be an Error, m is a letter");
	}

	processLetters(my_list);
    }
}
	    
