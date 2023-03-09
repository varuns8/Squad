package Ch17_CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingForLoop {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Yellow");
		al.add("Pink");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		
		System.out.println(al);
		
		System.out.println("Using Normal For Loop: ");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(" ");
		
		System.out.println("Using For Each Loop: ");
		for(String s:al) {
			System.out.println(s);
		}
		
		System.out.println(" ");
		
		/*
		 * Iterator is interface which is used to fetch elements from collection.
		 * 
		 * We get the implemented object of Iterator type with the help of .iterator()
		 * is present in all Collection classes.
		 * 
		 * hasNext() checks if there is more members to b fetched
		 * next() it fetched the next member
		 */
		
		System.out.println("Using Itrerator: ");
		Iterator <String> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
