package ExceptionHandling;

class InvalidAgeException extends RuntimeException
{
	String msg;
	
	InvalidAgeException(String msg)
	{
		super(msg);
	}
	
}

public class ThrowKey 
{

	public static void main(String[] args) 
	{
		try 
		{
		int age = 10;
		
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


