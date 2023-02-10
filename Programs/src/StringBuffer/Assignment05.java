package StringBuffer;

import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Here: ");
		String s = sc.nextLine();
		
		String s1 = s.toUpperCase();
		String s2[] = s1.split(" ");
		
		for(int i=0; i<s2.length;i++) {
			System.out.print(s2[i].charAt(0)+".");
		}
		
		
		

	}

}
