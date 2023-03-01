package Ch10_StringBuffer;

public class Demo12_TrimMethod {

	public static void main(String[] args) {
		String s1="	What's Up!	";
		System.out.println("Original: "+s1);
		s1=s1.trim();
		System.out.println("\nAfter: "+s1);

	}

}
