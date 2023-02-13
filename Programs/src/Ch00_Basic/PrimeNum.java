package Ch00_Basic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
		}
		if (counter==2) {
			System.out.println("Prime Number");
		} else{
			System.out.println("Not Prime Number");
		}

	}

}
