package Ch14_FileHandling;

import java.io.FileInputStream;

//WAP to read "A.txt" file data and convert byte code into char

public class Demo06_FileInputWithByteToChar {

	public static void main(String[] args) {
		try
		{
			FileInputStream fi = new FileInputStream("Diary.txt");
			byte b[] = new byte [fi.available()];
			fi.read(b);
			for(byte b1:b) {
				System.out.print((char)b1);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
