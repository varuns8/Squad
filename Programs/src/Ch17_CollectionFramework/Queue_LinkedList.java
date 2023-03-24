package Ch17_CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("Pankaj");
		q.offer("Anish");
		q.offer("Mandar");
		q.offer("Rahul");
		System.out.println("Original Elements: "+q);
		System.out.println("Return using Poll Method: "+q.poll());
		System.out.println("After Remove: "+q);

	}

}
