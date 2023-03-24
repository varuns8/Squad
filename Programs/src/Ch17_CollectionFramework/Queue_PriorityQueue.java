package Ch17_CollectionFramework;

import java.util.PriorityQueue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.offer("Pankaj");
		pq.offer("Anish");
		pq.offer("Mandar");
		pq.offer("Rahul");
		System.out.println("Using Offer Method Add Elements: "+pq);
		//pq.poll(); // it will remove elements, if queue is empty it return null
		//pq.remove(); // it will remove elements, if queue is empty then runtime exception will show in output
		//pq.peek(); // it only return null if queue is empty
		//pq.element(); // it show runtime exception if queue is empty
	}

}
