//This is a binary search tree that stores integers

public class IntSearchTree{
    public IntNode root;

    public void insert(int data){
	if( root == null ){
	    root = new IntNode(data);
	}
	else{
	    root.insert(data);
	}
    }

    public boolean search(int target){
	if( root == null){
	    return false;
	}
	else{
	    return root.search(target);
	}
    }

    public IntNode getRoot(){
	return root;
    }

    //Constructor
    public IntSearchTree(){
	root = null;
    }
}
