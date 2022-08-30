//IMPORTANT: You will modify this class to add functions
//the functions that you need to add are described in the assignment document

//All functions in this class are static.
//This class is never intended to be constructed.

import java.util.Random;

public abstract class TreeUtilities{

    public static void printTreeHelper(IntNode nd){
	if (nd != null){
	    printTreeHelper(nd.getLeft());
	    System.out.print(nd.getData());
	    System.out.print(" ");
	    printTreeHelper(nd.getRight());
	}
    }

    //This function prints all of the data an IntSearchTree in order
    //Starting with the lowest and going to the highest
    public static void printTree(IntSearchTree tree){
	printTreeHelper(tree.getRoot() );
	System.out.println("");
    }

    //This function creates a IntSearchTree filled with randomly chosen data
    //num is the number of nodes in the random search tree
    //max_val is the upper limit on the randomly chosen integer data
    public static IntSearchTree makeRandomTree(int num, int max_val){
	Random rand = new Random();
	IntSearchTree tree = new IntSearchTree();
	
	for(int i=0; i<num; i++){
	    int rand_data = rand.nextInt(max_val);
	    tree.insert(rand_data);
	}

	return tree;
    }

    //Don't hesitate to modify this code, it is only here for testing purposes
    public static void main(String args[]){
	IntSearchTree tree = makeRandomTree(10, 20);
	printTree(tree);

	System.out.println("Is 5 in the tree?");
	System.out.println(tree.search(5));
	System.out.println("Is 7 in the tree?");
	System.out.println(tree.search(7));
       	System.out.println("Is 18 in the tree?");
	System.out.println(tree.search(18));
	
	    
    }
}
