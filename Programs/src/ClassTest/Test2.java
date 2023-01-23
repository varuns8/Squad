package ClassTest;

class Employee{
	int eid,exp;
	float sal;
	String name,role;
	
	Employee(){ //zero constructor
		role = "Developer";
		
	}
	
	Employee(int eid, int exp, float sal, String name) { //parameterize 
		
		this.eid = eid;
		this.exp = exp;
		this.sal = sal;
		this.name = name;
	}
	
	void Data() {
		System.out.println("Employe employee id: "+eid);
		System.out.println("Employe employee name: "+name);
		System.out.println("Employe employee experiance: "+exp);
		System.out.println("Employe employee salary: "+sal);
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,2,20000,"Rahul");
		e1.Data();
		Employee e2 = new Employee();
		System.out.println("Employe employee role: "+e2.role);
		

	}

}
