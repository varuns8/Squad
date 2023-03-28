package Ch17_CollectionFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class Map_TreeMapWithSortedMap {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(105,"Pankaj");
		sm.put(102, "Mandar");
		sm.put(104, "Prabhu");
		sm.put(101, "Anish");
		sm.put(103, "Prakash");
		
		System.out.println(sm); // Its sorted
		
		System.out.println(sm.firstKey()); // its return first key
		System.out.println(sm.lastKey()); // its return last key
		System.out.println(sm.headMap(103)); // its return previous key without including it self
		System.out.println(sm.tailMap(102)); // its return next key with including it self

	}

}
