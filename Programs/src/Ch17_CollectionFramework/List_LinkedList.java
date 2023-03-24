package Ch17_CollectionFramework;

import java.util.*;

public class List_LinkedList {

	public static void main(String[] args) {
		System.out.println("------------LinkedList With List Interface-------------");
		List<String> li = new LinkedList<>();
		li.add("Banana");
		li.add("Mango");
		li.add("Apple");
		li.add("Orange");
		System.out.println(" ");
		System.out.println("Before Remove"+li);
		li.remove(0);
		System.out.println("After Remove : "+li);
		System.out.println("Index of Mango is : "+li.indexOf("Mango"));
		System.out.println(" ");
		
		System.out.println("------------LinkedList With Queue Interface-------------");
		Queue<String> q = new LinkedList<>();
		q.add("Banana");
		q.add("Mango");
		q.add("Apple");
		q.add("Orange");
		System.out.println(" ");
		System.out.println("Before Adding : "+q);
		q.offer("Pineapple"); // offer() is method of queue and Deque both, it used to add new elements.
		System.out.println("After Adding : "+q);
		System.out.println("Before Remove : "+q);
		q.poll();//poll() is method of queue, it used to remove from queue.by default it will remove fist.
		System.out.println("After Remove : "+q);
		System.out.println(" ");
		
		System.out.println("------------LinkedList With Deque Interface-------------");
		Deque<String> dq = new LinkedList<>();
		dq.add("Banana");
		dq.add("Mango");
		dq.add("Apple");
		dq.add("Orange");
		System.out.println(" ");
		System.out.println("Before Remove : "+dq);
		dq.pollLast(); // pollLast() is Method of Deque, it used to remove last elements.
		System.out.println("After Remove : "+dq);

	}

}
