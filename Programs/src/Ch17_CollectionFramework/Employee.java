package Ch17_CollectionFramework;

public class Employee {
	Integer eid;
	String ename,designation;
	double sal;

	public Employee(Integer eid, String ename, String designation, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", sal=" + sal + "]";
	}

	

}
