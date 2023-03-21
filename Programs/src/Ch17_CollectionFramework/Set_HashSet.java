package Ch17_CollectionFramework;

import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Cat");
		hs.add("Ant");
		hs.add("Giraffe");
		hs.add(null);
		hs.add("Mouse");
		hs.add("Giraffe");
		System.out.println(hs);
	}
}
