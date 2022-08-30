
//IMPORTANT: Note that the testStack and testQueue functions don't need to care at all about which implementation of a UnlimitedArray is being used. 

public class TestPartB{

    static void testStack( Stack st ){
	System.out.println("");
	System.out.println("-------------");
	System.out.println("Stack : Pushing Numbers");

	st.push(1);
	System.out.println("1");
	st.push(2);
	System.out.println("2");
	st.push(3);
	System.out.println("3");
	st.push(4);
	System.out.println("4");
	st.push(5);
	System.out.println("5");

	System.out.println("");
	System.out.println("-------------");
	System.out.println("Stack : Popping Numbers");
	int number;
	while( ! st.isEmpty()){
	    number = st.pop();
	    System.out.println(number);
	}
    }

    static void testQueue( Queue q ){
	System.out.println("");
	System.out.println("-------------");
	System.out.println("Queue : Enqueue");

	q.enqueue(1);
	System.out.println("1");
	q.enqueue(2);
	System.out.println("2");
	q.enqueue(3);
	System.out.println("3");
	q.enqueue(4);
	System.out.println("4");
	q.enqueue(5);
	System.out.println("5");

	System.out.println("");
	System.out.println("-------------");
	System.out.println("Queue : Dequeue");
	int number;
	while( ! q.isEmpty()){
	    number = q.dequeue();
	    System.out.println(number);
	}
    }

    public static void main(String[] args){
	Stack st3 = new Stack( new UnlimitedArrayCircle() );
	Queue q3 = new Queue( new UnlimitedArrayCircle() );

	testStack(st3);
	testQueue(q3);
	
    }
}
	    
