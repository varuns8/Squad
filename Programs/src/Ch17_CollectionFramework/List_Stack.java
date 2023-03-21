package Ch17_CollectionFramework;

import java.util.Enumeration;
import java.util.Stack;

public class List_Stack {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.add("Green");
		s.push("Blue");
		s.push(null);
		s.push("Green");
		s.push("Black");
		
		System.out.println("Before Remove : "+s);
		s.pop();
		System.out.println("After Remove"+s);
		
		System.out.println("-----------------Using Enumeration-----------------");
		Enumeration<String> e=s.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
