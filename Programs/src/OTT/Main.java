package OTT;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Function of = new Function();
		of.menu();
		of.choice();
		
		while(true) 
		{
			try
			{
			int key = sc.nextInt();
			
			switch(key) 
			{
			case 1:
				of.add();
				of.choice();
				break;
				
			case 2:
				of.show();
				of.choice();
				break;
				
			case 3:
				of.dlt();
				of.choice();
				break;
				
			case 4:
				of.update();
				of.choice();
				break;
				
			case 5:
				of.exit();
				break;
					
			default:
				System.out.println("---------------------------------------");
				System.out.print("Please Enter Correct Choice : ");
			}
			}
			catch(Exception e)
			{
				System.out.println("------------------------------------------------------------------");
				System.out.println("Please Enter Valid Number, Character Value not Allow ! Try Again. ");
				System.out.println("------------------------------------------------------------------");
				break;
			}
			
		}

	}

}