package programs;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		 LinkedList<String> l = new LinkedList<String>();
	     l.add("Mouni");
	     l.add("Madhu");
	     
	     Iterator i = l.descendingIterator();
	     while(i.hasNext()){
	         System.out.println(i.next());
	     }

	}

}
