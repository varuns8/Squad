package Ch17_CollectionFramework;

import java.util.*;

public class ArrayListComparable {

	public static void main(String[] args) {
		/*
		 * Comparable : when ArrayList members are simple string,integer we are able
		 * to solve the members easily using collection.sort() but
		 * when ArrayList members are complex such has class object as shown below:
		 * in our example each member is a person class,object.
		 * each person has id,add,name,contact of different type of data in such cases 
		 * collection.sort() will not able to sort the members properly since
		 * it will not understand on what basis it need to sort 
		 * so, we use either comparable/comparator to clearly specify need which variable compare for sorting
		 * 
		 * Comparator : is an interface having compare () this () is used to compared objects.
		 * steps to used 
		 * !st : make new class for comparing any 1 variable of the class
		 * 2ns : implements and import comparator interface
		 * 3rd : override compare() where we specify which variable compare
		 * 4th : when calling collection.sort() for sorting we pass to parameters 1st the List on which you want do the sorting
		 * 2nd the object of the class on which you have implement comparator
		 */
		ArrayList<Person> al=new ArrayList<>();
		
		Person p1 = new Person(104,"Pankaj",9988778877l,"Nanded");
		Person p2 = new Person(102,"Mandar",9988767678l,"Ghatkopar");
		Person p3 = new Person(103,"Prabuddha",9988774553l,"Dombivli");
		Person p4 = new Person(101,"Anish",9988353333l,"Kalyan");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("-------------Before Sorting-----------");
		for(Person p:al) {
			System.out.println(p);
		}
		
		System.out.println("-------------After Sorting------------");
		Collections.sort(al);
		System.out.println(al);

	}

}
