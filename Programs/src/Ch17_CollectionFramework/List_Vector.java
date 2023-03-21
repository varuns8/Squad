package Ch17_CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.add("Green");
		v.add("Blue");
		v.add(null);
		v.add("Green");
		v.add("Black");
		
		System.out.println(v);
		
		System.out.println("-----------------Using Enumeration-----------------");
		Enumeration<String> e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
