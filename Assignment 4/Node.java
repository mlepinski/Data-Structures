//This class represents a node in a Linked List
//The class holds one character of data

public class Node{
    private char data;
    private Node next;

    public Node(char c, Node n){
	data = c;
	next = n;
    }

    public Node(char c){
	data = c;
	next = null;
    }

    public char getData(){
	return data;
    }

    public Node getNext(){
	return next;
    }

    public void setData(char c){
	data = c;
    }

    public void setNext(Node n){
	next = n;
    }
}
