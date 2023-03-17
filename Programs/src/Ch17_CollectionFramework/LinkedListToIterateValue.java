package Ch17_CollectionFramework;

import java.util.*;

public class LinkedListToIterateValue {

	public static void main(String[] args) {
		LinkedList<Employee> li=new LinkedList<>();
		
		Employee e1 = new Employee(104,"Pankaj","Developer",30000);
		Employee e2 = new Employee(102,"Mandar","Tester",15000);
		Employee e3 = new Employee(103,"Prabuddha","Developer",20000);
		Employee e4 = new Employee(101,"Anish","Tester",25000);
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		System.out.println("Using Iterator");
		Iterator<Employee> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
