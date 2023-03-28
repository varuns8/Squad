package Ch17_CollectionFramework;

import java.util.TreeMap;

public class Map_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(105,"Pankaj");
		tm.put(102, "Mandar");
		tm.put(104, "Prabhu");
		tm.put(101, "Anish");
		tm.put(103, "Prakash");
		
		System.out.println(tm.subMap(102, 104)); // its return values of key between mention by user

	}

}
