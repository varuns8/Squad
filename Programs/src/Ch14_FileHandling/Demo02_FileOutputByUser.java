package Ch14_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo02_FileOutputByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Note Here: ");
		String s = sc.nextLine();
		try
		{
			FileOutputStream f01 = new FileOutputStream("Diary.txt");
			byte b[]=s.getBytes();
			f01.write(b);
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
