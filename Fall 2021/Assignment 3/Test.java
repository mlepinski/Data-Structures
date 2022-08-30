public class Test{

    //This tests appending characters and printing
    //Note that this also works on classes that extend SimpleLinked
    public static void testSimple(SimpleLinked lst){

	lst.append('b');
	lst.append('a');
	lst.append('n');
	lst.append('a');
	lst.append('n');
	lst.append('a');

	System.out.println("This should print banana:");
	lst.print();
    }

    //This tests adding and removing in different locations
    //It also tests reversing the list
    public static void testComplex(ComplexLinked lst){
	lst.append('x');
	lst.append('b');
	boolean removed = lst.remove('x');
	if(removed){
	    System.out.println("Successfully removed an X");
	}

	lst.append('a');
	lst.append('a');
	lst.append('a');

	lst.insert(1, 'n');
	lst.insert(3, 'n');
	lst.insert(5, 'n');
	removed = lst.remove('n');
	if(removed){
	    System.out.println("Successfully removed an X");
	}

	lst.append('x');
	removed = lst.remove('x');
	if(removed){
	    System.out.println("Successfully removed an X");
	}
	removed = lst.remove('x');
	if(removed){
	    System.out.println("Error ... This remove should have failed!");
	}
	
	System.out.println("This should print banana:");
	lst.print();

	System.out.println("This should print ananab:");
	ComplexLinked new_lst = lst.reverse();
	lst.remove('n');
	lst.remove('n');
	new_lst.print();
    }
    
    public static void main(String[] args){
	SimpleLinked simple = new SimpleLinked();
	ComplexLinked complex1 = new ComplexLinked();
	ComplexLinked complex2 = new ComplexLinked();

	testSimple(simple);
	testSimple(complex1);
	testComplex(complex2);
	
    }
}
