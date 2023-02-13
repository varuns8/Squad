package Ch10_StringBuffer;

import java.util.Scanner;

public class Assignment06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Here: ");
		String s = sc.next();
		String rev="";
		String rev2="";
		String rev3="";
		
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.print(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		String s2 = rev.toUpperCase();
		System.out.println("Reverse: "+rev);
		System.out.println("Upper Case: "+s2);
		
		rev2=rev2+s2.charAt(0);
		String first = rev2.toLowerCase();
		
		for(int j=1;j<=s2.length()-1;j++) {
			rev3 = rev3+s2.charAt(j);
		}
		
		System.out.println("Lower Case: "+first+rev3);

	}

}
