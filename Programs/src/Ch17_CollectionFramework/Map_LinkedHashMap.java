package Ch17_CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(101,"Pankaj");
		lhm.put(102, "Mandar");
		lhm.put(103, "Prabhu");
		lhm.put(104, "Anish");
		lhm.put(105, "Prakash");
		System.out.println(lhm);
		
		System.out.println(lhm.get(102));
		
		System.out.println(lhm.remove(105));
		
		System.out.println(lhm);
		
		System.out.println(lhm.containsKey(103));
		
		Set s1=lhm.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Key   : "+me.getKey());
			System.out.println("Value : "+me.getValue());
			System.out.println(" ");
		}
	}

}
