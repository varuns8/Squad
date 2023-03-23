package Ch17_CollectionFramework;

import java.util.*;

public class ArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		Student s1 = new Student(101,"Mandar","Ghatkopar",82);
		Student s2 = new Student(103,"Rahul ","Kurla    ",76);
		Student s3 = new Student(102,"Pankaj","Panvel   ",70);
		Student s4 = new Student(104,"Prabhu","Dombivli ",77);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Using ForEach Loop");
		System.out.println(" ");
		for (Student student : al) {
			System.out.println(student);
		}
		System.out.println(" ");
		
		System.out.println("Using Iterator");
		System.out.println(" ");
		Iterator<Student> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
