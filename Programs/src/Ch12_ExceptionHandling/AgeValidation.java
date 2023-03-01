package Ch12_ExceptionHandling;

class InvalidAgeException extends RuntimeException
{
	String msg;
	
	InvalidAgeException(String msg)
	{
		super(msg);
	}
	
}

public class AgeValidation 
{

	public static void main(String[] args) 
	{
		try 
		{
		int age = 19;
		
		if(age>=18) 
		{
			System.out.println("Elgible to vote!!!");
		}
		
		else 
		{
			throw new InvalidAgeException("Not Eligible to Vote!!!");
		}
		}
		catch(InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("\nHello");
	}
}


