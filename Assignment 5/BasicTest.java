//This file has some basic testing for Search and Insert.
//It doesn't test remove
//You are encouraged to modify the file to test remove
// ... if you were able to get remove implemented

public class BasicTest{

    public static void test_search(SearchList s_list){
	s_list.insert( new Integer(5) );
	s_list.insert( new Integer(10) );
	s_list.insert( new Integer(2) );

	System.out.println("This should print: 2 5 10");
	s_list.print();

	s_list.insert( new Integer(1) );
	s_list.insert( new Integer(20) );
	s_list.insert( new Integer(50) );

	System.out.println("This should print: 1 2 5 10 20 50");
	s_list.print();

	s_list.insert( new Integer(100) );
	s_list.insert( new Integer(25) );
	s_list.insert( new Integer(75) );
	s_list.insert( new Integer(15) );

	System.out.println("This should print: 1 2 5 10 15 20 25 50 75 100");
	s_list.print();

	System.out.println("Is 5 in the list?");
	System.out.println( "Answer: " + s_list.search( 5 ));

	System.out.println("Is 100 in the list?");
	System.out.println( "Answer: " + s_list.search( 100 ));

	System.out.println("Is 75 in the list?");
	System.out.println( "Answer: " + s_list.search( 75 ));

	System.out.println("Is 500 in the list?");
	System.out.println( "Answer: " + s_list.search( 500 ));

	System.out.println("Is 32 in the list?");
      	System.out.println( "Answer: " + s_list.search( 32 ));
	
    }

	
    
    public static void main(String[] args){
	SearchList s_list;
	s_list = new SkipList<Integer>();

	test_search(s_list);
	
    }
	
	
    
}
