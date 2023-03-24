package Ch17_CollectionFramework;

import java.util.ArrayDeque;

public class Queue_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String> aq = new ArrayDeque<>();
		aq.offerFirst("a"); // this method add element at 1st position
		aq.offerLast("b"); // this method add element at last position
		System.out.println(aq);
		aq.addFirst("ab"); // this method add element at 1st position
		aq.addLast("ba"); // this method add element at last position
		System.out.println(aq);
		aq.pollFirst(); // this method remove element at 1st position
		aq.pollLast(); // this method remove element at last position
		System.out.println(aq);
		
		System.out.println(aq.peekFirst()); // this method return only
		System.out.println(aq.peekLast()); // this method return only
		
		System.out.println(aq);

	}

}
