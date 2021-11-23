
//IMPORTANT: Note that the testStack and testQueue functions don't need to care at all about which implementation of a UnlimitedArray is being used. 

public class Test{

    static void testDictionary( Dictionary<String> dict){
	System.out.println("");
	System.out.println("-------------");
	System.out.println("Adding items to the Dictionary");

	dict.insert("grape", "purple");
        dict.insert("orange", "orange");
	dict.insert("strawberry", "red");
	dict.insert("blueberry", "blue");
	dict.insert("apple", "green");
	dict.insert("cantalope", "orange");
	dict.insert("lemon", "yellow");
	dict.insert("watermelon", "red");
	dict.insert("kiwi", "green");
	dict.insert("banana", "yellow");
	dict.insert("chocolate", "brown");


	System.out.println("");
	System.out.println("-------------");
	System.out.println("Testing Lookups");

	String ans;
	ans = dict.lookup("grape");
	System.out.println("This should print: purple");
	System.out.println(ans);

	ans = dict.lookup("banana");
	System.out.println("This should print: yellow");
	System.out.println(ans);

	ans = dict.lookup("orange");
	System.out.println("This should print: orange");
	System.out.println(ans);

	ans = dict.lookup("kiwi");
	System.out.println("This should print: green");
	System.out.println(ans);

	ans = dict.lookup("blueberry");
	System.out.println("This should print: blue");
	System.out.println(ans);
    }


    public static void main(String[] args){
        Dictionary<String> test_dict = new HashTable<String>();

	testDictionary(test_dict);
	
    }
}
	    
