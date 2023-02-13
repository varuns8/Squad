package Ch10_StringBuffer;

import java.util.Scanner;

public class PasswordMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String Pass = sc.next();
		String Password = new String(Pass);
		System.out.println("Enter Confirm Password: ");
		String CPass = sc.next();
		String Confirm = new String(CPass);
		if(Pass.equals(CPass))
		{
			System.out.println("Password Match Successfully Login");
		}
		else
		{
			System.out.println("Password Not Match");
		}
		

	}

}
