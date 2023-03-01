package Ch14_FileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

//WAP to Read specific file i.e "fileinfo.txt"

/* Notes
 * Scanner is predefine class
 * we usually used scanner to scan data from console ---> Scanner sc = new Scanner(System.in);
 * 
 * But in below given example we are scanning data from file.
 * sc.hasNextLine() will check if there is more data in nextline. It return true if there is more data else it return false
 */

public class Demo07_HasNextLineMethod {

	public static void main(String[] args) {
		try
		{
			FileInputStream fi2 = new FileInputStream("fileinfo.txt");
			Scanner sc = new Scanner(fi2);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
