package Ch17_CollectionFramework;
import java.util.ArrayList;

public class List_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("sam");
		al.add(12);
		al.add(2.3);
		al.add('c');
		al.add("sam");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));
	}

}
