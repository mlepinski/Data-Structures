//This class represents a node in a Linked List
//The class holds one character of data

public class DNode<T extends Comparable>{
    private T data;
    private DNode next;
    private DNode previous;

    public DNode(T the_data){
	data = the_data;
	next = null;
	previous = null;
    }

    public T getData(){
	return data;
    }

    public DNode getNext(){
	return next;
    }

    public DNode getPrevious(){
	return previous;
    }

    public void setData(T the_data){
	data = the_data;
    }

    public void setNext(DNode n){
	next = n;
    }

    public void setPrevious(DNode p){
	previous = p;
    }
}
