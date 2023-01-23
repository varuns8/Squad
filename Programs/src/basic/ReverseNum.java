package basic;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,rev=0;
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		while(num>0) {
			int remender = num%10;
			num = num/10;
			rev = rev*10 + remender;
			
		}
		System.out.println("Reverse Number is "+rev);

	}

}
