//This class is a good place to put any functions that you write
//that are not part of IntScapegoat or IntSearchTree
//Feel free to change/delete any existing code in this file

public class Test{

    static void test_search_tree(){
	IntSearchTree temp = new IntSearchTree();

	temp.insert(6);
	temp.insert(5);
	temp.insert(4);
	temp.insert(3);
	temp.insert(10);
	temp.insert(9);
	temp.insert(11);

	temp.printTree();
	System.out.println("Size: "+temp.getSize());
	System.out.println("Height: "+temp.getHeight());
	System.out.println("Left Size: "+temp.getLeftSize());
	System.out.println("Left Height: "+temp.getLeftHeight());
	System.out.println("Right Size: "+temp.getRightSize());
	System.out.println("Right Height: "+temp.getRightHeight());
    }
    
    public static void main(String[] args){
	// test_search_tree();

    }
}
