package Ch14_FileHandling;

import java.io.FileInputStream;

//WAP to read "fileinfo.txt" file data and convert byte code into char

public class Demo06_FileInputWithByteToChar {

	public static void main(String[] args) {
		try
		{
			FileInputStream fi = new FileInputStream("fileinfo.txt");
			byte b[] = new byte [fi.available()];
			fi.read(b);
			System.out.print(b);//this is byte code
			System.out.println(" ");
			for(byte b1:b) //this for loop read 1 by 1 char in fileinfo.txt file and stored it in b1
			{
				System.out.print((char)b1);//here byte code convert into char
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
