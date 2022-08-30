//This is a binary search tree that stores integers

public class IntNode{
    public IntNode left;
    public IntNode right;
    public IntNode parent;
    public int data;

    public void insert(int new_data){
	if( new_data >= data){
	    //Insert larger values on the right
	    if( right == null){
		right = new IntNode(new_data);
		right.setParent(this);
	    }
	    else{
		right.insert(new_data);
	    }
	}

	if( new_data < data){
	    //Insert smaller values on the left
	    if( left == null){
		left = new IntNode(new_data);
		left.setParent(this);
	    }
	    else{
		left.insert(new_data);
	    }
	}
    }

    public boolean search(int target){
	if( data == target ){
	    return true;
	}
	if( target > data ){
	    //Find larger values on the right
	    if( right != null){
		return right.search(target);
	    }
	}

	if( target < data){
	    //Find smaller values on the left
	    if(left != null){
		return left.search(target);
	    }
	}
	
	return false;
    }

    public int getData(){
	return data;
    }

    public void setData(int d){
	data = d;
    }

    public IntNode getLeft(){
	return left;
    }

    public void setLeft(IntNode nd){
	left = nd;
    }

    public IntNode getRight(){
	return right;
    }

    public void setRight(IntNode nd){
	right = nd;
    }

    public IntNode getParent(){
	return parent;
    }

    public void setParent(IntNode nd){
	parent = nd;
    }

    public boolean isLeaf(){
	if ( (left == null) && (right == null) ){
	    return true;
	}
	else {
	    return false;
	}
    }

    //Constructor
    public IntNode(int the_data){
	data = the_data;
    }
}
