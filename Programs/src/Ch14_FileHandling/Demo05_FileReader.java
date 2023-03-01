package Ch14_FileHandling;

import java.io.FileReader;

//WAP to read "fileinfo.txt" file data

public class Demo05_FileReader {

	public static void main(String[] args) {
		
		try
		{
			FileReader fr= new FileReader("fileinfo.txt");
			char ch[] = new char[100];
			fr.read(ch);
			for(char c:ch) //here in c each and every single character read of ch and store it as a string
			{
				System.out.print(c);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
