package Ch17_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListComparator {

	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<>();
		
		Person p1 = new Person(104,"Pankaj",9988778877l,"Nanded");
		Person p2 = new Person(102,"Mandar",9988767678l,"Ghatkopar");
		Person p3 = new Person(103,"Prabuddha",9988774553l,"Dombivli");
		Person p4 = new Person(101,"Anish",9988353333l,"Kalyan");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("-----Unsorted-----");
		System.out.println(" ");
		
		for (Person p:al) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("-----Sorting Acording to id-----");
		System.out.println(" ");
		Collections.sort(al,new ComparatorId());
		
		for (Person p:al) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("-----Sorting Acording to name-----");
		System.out.println(" ");
		Collections.sort(al,new ComparatorName());
		
		for (Person p:al) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("-----Sorting Acording to add-----");
		System.out.println(" ");
		Collections.sort(al,new ComparatorAdd());
		
		for (Person p:al) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("-----Sorting Acording to Comparator Natural Order-----");
		System.out.println(" ");
		al.sort(Comparator.naturalOrder());
		
		for (Person p:al) {
			System.out.println(p);
		}

	}

}
