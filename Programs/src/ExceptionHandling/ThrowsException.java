package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class readwrite
{
	void read()throws FileNotFoundException
	{
	FileInputStream fi = new FileInputStream("A.txt");
	}
}

public class ThrowsException 
{

	public static void main(String[] args)
	{
		
		readwrite rw = new readwrite();
		try {
		rw.read();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello!");

	}

}
