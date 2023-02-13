package Exam;

class Person{
	int id;
	long pno;
	String name,clg,add;
	
	public Person(int id, long pno, String name, String clg, String add) {
		this.id = id;
		this.pno = pno;
		this.name = name;
		this.clg = clg;
		this.add = add;
	}
	
	void PersonData() {
		System.out.println("Person id is "+id);
		System.out.println("Person name is "+name);
		System.out.println("Person phone no is "+pno);
		System.out.println("Person College name is "+clg);
		System.out.println("Person Address is "+add);
	}
	
	
	
}

public class Test1 {

	public static void main(String[] args) {
		Person p1 = new Person(101,6677889955l,"Soham","Kgce","Badlapur");
		p1.PersonData();
		System.out.println(" ");
		Person p2 = new Person(102,4433556677l,"Sam","Datta meghe", "Airoli");
		p2.PersonData();
		

	}

}
