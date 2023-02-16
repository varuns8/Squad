package Ch13_MultiThreading;

import java.util.Scanner;

class Calculator extends Thread{
	int totalMarks;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mark1: ");
		int marks1 = sc.nextInt();
		System.out.println("Enter Mark2: ");
		int marks2 = sc.nextInt();
		totalMarks=marks1+marks2;
	}
	
}

public class Demo07_PercentageCalculator {

	public static void main(String[] args) {
		Calculator th = new Calculator();
		th.start();
		try
		{
			th.join();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		double percentage = th.totalMarks/200.0*100;
		System.out.println("Percentage: "+percentage);

	}

}
