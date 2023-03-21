package Ch17_CollectionFramework;

// SortedHashSet is interface 

import java.util.*;

public class Set_SortedHashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Enter String: ");
		
		for(int i=1;i<=5;i++) {
			list.add(sc.next());
		}
		
		System.out.println("Using ArrayList : "+list);
		
		Set<String> set = new TreeSet<String>(list);
		System.out.println("Using TreeSet with SortedHashSet Interface: "+set);

	}

}
