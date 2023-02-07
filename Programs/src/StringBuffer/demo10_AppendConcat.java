package StringBuffer;

public class demo10_AppendConcat {

	public static void main(String[] args) {
		//String creates immutable(Not Change) Object.
		//StringBuffer and StringBuilder creates mutable(Change) objects
		
		//Concat
		String s1 = new String("Sameena");
		System.out.println(s1.concat("Khan"));
		
		//Append
		StringBuffer sb1 = new StringBuffer("Sammena");
		System.out.println(sb1.append("Khan"));

	}

}
