package StringBuffer;

public class demo3 {

	public static void main(String[] args) {
		// intern() points to SCP object
		
		String s1 = "Coder"; //s1 point to SCP object
		String s2 = "Coder"; //s2 point to SCP object
		System.out.println("Are s1 and s2 point to same Object? "+(s1==s2));
		
		String s3 = new String("Coder");
		System.out.println("Are s1 and s3 point to same Object? "+(s1==s3));
		
		String s4=s3.intern();
		System.out.println("s4: "+s4);
		System.out.println("Are s2 and s4 point to same Object? "+(s2==s4));

	}

}
