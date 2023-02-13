package Ch10_StringBuffer;
import java.util.Scanner;

public class Assignment07 {

	public static void main(String[] args) {
		// Accept the string and prit letter of odd index:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Here: ");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++) {
			if(i%2==1) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
