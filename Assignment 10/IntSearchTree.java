//This is a binary search tree that stores integers

public class IntSearchTree implements IntDataSet{
    int data;
    int height;
    int size;
    IntSearchTree leftChild;
    IntSearchTree rightChild;

    //Insert a new value into the Tree
    public void insert(int value){
	if( size == 0 ){
	    data = value;
	    size = 1;
	    height = 1;
	}
	else{
	    if( value <= data){
		leftInsert(value);
	    }
	    if( value > data){
		rightInsert(value);
	    }
	    size = 1 + getLeftSize() + getRightSize();
	    height = 1 + Math.max( getLeftHeight(), getRightHeight() );
	}
    }

    //Insert a value in the left child's subtree
    public void leftInsert(int value){
	if(leftChild == null){
	    leftChild = new IntSearchTree(value);
	}
	else{
	    leftChild.insert(value);
	}
    }

    
    //Insert a value in the left child's subtree
    public void rightInsert(int value){
	if(rightChild == null){
	    rightChild = new IntSearchTree(value);
	}
	else{
	    rightChild.insert(value);
	}
    }	    

    //Return True if the Target data is present in the tree
    public boolean search(int target){
	if( target == data){
	    return true;
	}
	else{
	    if (target <= data && leftChild != null){
		return leftChild.search(target);
	    }
	    if (target > data && rightChild !=null){
		return rightChild.search(target);
	    }
	    return false;
	}
    }

    public int getData(){
	return data;
    }

    public int getHeight(){
	return height;
    }

    public int getLeftHeight(){
	if( leftChild == null){
	    return 0;
	}
	else{
	    return leftChild.getHeight();
	}
    }

    public int getRightHeight(){
	if( rightChild == null){
	    return 0;
	}
	else{
	    return rightChild.getHeight();
	}
    }
    
    public int getSize(){
	return size;
    }

    //Return the number of data items in the left subtree
    public int getLeftSize(){
	if( leftChild == null){
	    return 0;
	}
	else{
	    return leftChild.getSize();
	}
    }

    //Return the number of data items in the right subtree
    public int getRightSize(){
	if( rightChild == null){
	    return 0;
	}
	else{
	    return rightChild.getSize();
	}
    }

    public void printTree(){
	if (leftChild != null){
	    leftChild.printTree();
	}
        System.out.println(data);
	if (rightChild != null){
	    rightChild.printTree();
	}
    }

    //Constructor
    public IntSearchTree(){
	height = 0;
	size = 0;
	leftChild = null;
	rightChild = null;
    }

    public IntSearchTree(int the_data){
	data = the_data;
	height = 1;
	size = 1;
	leftChild = null;
	rightChild = null;
    }
}
