//This class stores  a Linked List of characters


public class SimpleLinked{
    Node start;
    int len;

    //Creates an empty linked list
    public void Linked(){
	start = null;
	len = 0;
    }

    //Appends a new character to the end of the list
    public void append(char c){
	if (start == null){
	    start = new Node(c);
	}
	else{
	    Node current = start;
	    while(current.getNext() != null){
		current = current.getNext();
	    }
	    current.setNext( new Node(c) );
	}
	len = len + 1;
    }

    //Returns the number of items in the list
    public int getSize(){
	return len;
    }
    
    //Prints the contents of the list
    public void print(){
	Node current = start;
	String to_print = "";
	
	while(current != null){
	    to_print = to_print + current.getData();
	    current = current.getNext();
	}

	System.out.println(to_print);
    }

}

	    
