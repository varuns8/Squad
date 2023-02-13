package Ch12_ExceptionHandling;

import java.util.Scanner;

class TooOldAgeException extends RuntimeException
{
	String msgo;
	
	TooOldAgeException(String msgo)
	{
		super(msgo);
	}
	
}

class TooYoungAgeException extends RuntimeException
{
	String msgy;
	
	TooYoungAgeException(String msgy)
	{
		super(msgy);
	}
}

public class Matrimonial 
{

	public static void main(String[] args) 
	{
		try 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		if (age>=18) 
		{
			if (age>=60) 
			{
				throw new TooOldAgeException("Your age s Exceede Marrage age. You lost your chance!!!");
			} else {
				System.out.println("You are Eligible to marriage");
			}
		} else {
			throw new TooYoungAgeException("Don't Take tension, wait for some more time u will get best match!!! ");
		}
		}
		catch(TooOldAgeException e) 
		{
			e.printStackTrace();
		}
		catch(TooYoungAgeException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("\nHello");
		
		
	}

}
