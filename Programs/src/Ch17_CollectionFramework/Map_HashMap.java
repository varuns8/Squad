package Ch17_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101,"Pankaj");
		hm.put(102, "Mandar");
		hm.put(103, "Prabhu");
		hm.put(104, "Anish");
		hm.put(105, "Prakash");
		System.out.println(hm);
		
		System.out.println(hm.get(101)); //It's Return value of key
		
		System.out.println(hm.remove(105)); //It's Remove key from db
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(103)); //If value will present then its true otherwise its false
		
		hm.put(104, "Umesh"); //if you want change value of key 
		System.out.println(hm);
		
		System.out.println(hm.containsValue("Rajesh")); // here value of rajesh not present in db so return false
		
		hm.put(106, null);
		System.out.println(hm.containsKey(106)); // it's accept null value also
		System.out.println(hm);
		
		System.out.println("==========================================================");
		System.out.println(" ");
		HashMap<Integer, String> hm1=new HashMap<>();
		hm1.put(101,"Pranav");
		hm1.putAll(hm); //its override hm1 object to hm object
		System.out.println(hm1);
		
		System.out.println("==========================================================");
		System.out.println(" ");
		System.out.println(hm.keySet()); // it show key (Roll number) and convert map to collection
		System.out.println(hm.values()); // it show value (Name) and convert map to collection
		System.out.println(hm.entrySet()); // it show both key and values and convert map to collection
		
		System.out.println("==========================================================");
		System.out.println(" ");
		Set s1=hm.entrySet(); // here we convert map interface to collection interface
		Iterator itr = s1.iterator(); // here we show data using Iterator
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("==========================================================");
		System.out.println(" ");
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.println("Key : "+me.getKey());
			System.out.println("Value : "+me.getValue());
		}
	}

}
