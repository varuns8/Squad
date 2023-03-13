package Ch17_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithSortMethod {
	public static void main(String[] args) {
		/*
		 * By default array dosn't sort its member in any order
		 * 
		 * Collection class is provided by java to manipulate the members of our collections.
		 * so if we want to rearrange the member of our ArrayList we take the help of collections class Methods
		 * 
		 * Collections class is singleton class. Its constructor is private, so we will not be able to create the
		 * object of collections class with new keyword.
		 * 
		 * All Method in collections class are static and we call them directly by the class name
		 */
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Yellow");
		al.add("Pink");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		
		System.out.println("-------------Before Sorting-----------");
		System.out.println(al);
		System.out.println("-------------After Sorting------------");
		Collections.sort(al);
		System.out.println(al);
		
	}

}
