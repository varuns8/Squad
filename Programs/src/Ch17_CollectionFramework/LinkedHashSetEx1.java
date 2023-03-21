package Ch17_CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("Cat");
		ls.add("Ant");
		ls.add("Giraffe");
		ls.add(null);
		ls.add("Mouse");
		ls.add("Giraffe");
		System.out.println(ls);

	}

}
