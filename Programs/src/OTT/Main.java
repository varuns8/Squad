package OTT;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Function of = new Function();
		
		
		while(true) 
		{
			try
			{
			of.menu();
			of.choice();
			
			int key = sc.nextInt();
			
			switch(key) 
			{
			case 1:
				of.add();
				break;
				
			case 2:
				of.show();
				break;
				
			case 3:
				of.dlt();
				break;
				
			case 4:
				of.update();
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