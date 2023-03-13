package Ch17_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUsingForLoop2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Yellow");
		al.add("Pink");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		
		System.out.println(al);
		
		System.out.println("Using Simple ForLoop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("");
		
		System.out.println("Using ForEach Loop");
		for(String n:al) {
			System.out.println(n);
		}
		System.out.println("");
		
		System.out.println("Using Iterator");
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("");
		System.out.println("Using ListIterator");
		System.out.println("Front to Back");
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) { //Front to Back
			System.out.println(li.next());
		}
		System.out.println("");
		System.out.println("Back to Front");
		ListIterator<String> li2 = al.listIterator(al.size());
		while(li2.hasPrevious()) { //Back to Front
			System.out.println(li2.previous());
		}

	}

}
