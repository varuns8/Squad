package Test;

import java.util.Scanner;

//generate mini calculator handle the exception following 
//mini calculator can't handle above 99999
//negative value
//throw all the exception towords caller

/*class NotCalculateException extends RuntimeException{
	String msg;
	
	NotCalculateException(String msg){
		super(msg);
	}
}

class NegativeValueException extends RuntimeException{
	String msg;
	
	NegativeValueException(String msg){
		super(msg);
	}
}*/
class Value{
	void xsum(int sum){
		if(sum>99999) {
			System.out.println(" ");
			//throw new NotCalculateException("Number is big");
		}
		if(sum<0) {
			System.out.println(" ");
			//throw new NegativeValueException("Negative Value Not allow");
		}
	}
}

public class Test3 {

	public static void main(String[] args) throws Exception {
		Value v1 = new Value();
		
		int num1,num2,choice;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("1.Addition");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice : ");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter First Number: ");
				num1=sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2=sc.nextInt();
				int sum = num1+num2;
				v1.xsum(sum);
				/*if(sum>99999) {
					//throw new NotCalculateException("Number is big");
				}
				if(sum<0) {
					//throw new NegativeValueException("Negative Value Not allow");
				}*/
				System.out.println("Addition is: "+sum);
				break;
				
			case 2:
				System.out.println("Enter First Number: ");
				num1=sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2=sc.nextInt();
				int sub = num1-num2;
				/*if(sub>99999) {
					throw new NotCalculateException("Number is big");
				}
				if(sub<0) {
					throw new NegativeValueException("Negative Value Not allow");
				}*/
				System.out.println("Addition is: "+sub);
				break;
				
			case 3:
				System.out.println("Enter First Number: ");
				num1=sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2=sc.nextInt();
				int mul = num1*num2;
				/*if(mul>99999) {
					throw new NotCalculateException("Number is big");
				}
				if(mul<0) {
					throw new NegativeValueException("Negative Value Not allow");
				}*/
				System.out.println("Addition is: "+mul);
				break;
				
			case 4:
				System.out.println("Enter First Number: ");
				num1=sc.nextInt();
				System.out.println("Enter Second Number: ");
				num2=sc.nextInt();
				int div = num1/num2;
				/*if(div>99999) {
					throw new NotCalculateException("Number is big");
				}
				if(div<0) {
					throw new NegativeValueException("Negative Value Not allow");
				}*/
				System.out.println("Addition is: "+div);
				break;
				
			case 5:
				System.out.println("Thanks For Using");
				System.exit(0);
				
			default:
				System.out.println("Enter Correct Choice");
				
			}

		}
		
	}

}
