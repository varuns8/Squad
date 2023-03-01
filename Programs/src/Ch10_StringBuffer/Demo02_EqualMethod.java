package Ch10_StringBuffer;

public class Demo02_EqualMethod {

	public static void main(String[] args) {
		String s1 = new String("deepak");
		String s2 = new String("deepak");
		// if different case then it allocate different memory location.
		System.out.println(s1==s2);// == it allocate the address.
		System.out.println(s1.equals(s2)); // equals() is allocate the contain.
		String s3 = "amit";
		String s4 = "amit";
		System.out.println(s3==s4);
		
	}

}
