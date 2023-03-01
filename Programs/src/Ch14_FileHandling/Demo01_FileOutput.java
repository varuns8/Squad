package Ch14_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//WAP to create A.txt file and write data in that file

public class Demo01_FileOutput {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fo = new FileOutputStream("A.txt");
			String s1 = "Pankaj is innocent Boy.";
			byte b[]=s1.getBytes();
			fo.write(b);
			System.out.println("Data has been written");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}

	}

}
