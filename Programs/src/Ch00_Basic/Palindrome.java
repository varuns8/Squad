package Ch00_Basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,rev=0;
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		int temp = num;
		int count=0;
		while(num>0) {
			int remender = num%10;
			num = num/10;
			rev = rev*10 + remender;
			count++;
		}
		System.out.println(count+" digit number");
		if(temp==rev) {
			System.out.println(temp+" is Palindrome");
		} else {
			System.out.println(temp+" is not Palindrome");
		}
	}

}
