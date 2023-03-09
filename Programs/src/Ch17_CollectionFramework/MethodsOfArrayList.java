package Ch17_CollectionFramework;

import java.util.ArrayList;

public class MethodsOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Yellow");
		al.add(null);
		al.add("Green");
		al.add("Yellow");
		System.out.println("Before: "+al);
		System.out.println(al.get(2));
		
		System.out.println("is Pink is contain in the list ? "+al.contains("Pink"));
		System.out.println("No of Members Present in al: "+al.size());
		System.out.println("The index of the first Yellow: "+al.indexOf("Yellow"));
		System.out.println("The index of the last Yellow: "+al.lastIndexOf("Yellow"));
		
		al.remove(0);
		System.out.println("After Remove index of first element : "+al);
		
		al.clear();
		System.out.println("After claering: "+al+"\nis empty ? "+al.isEmpty());
		

	}

}
