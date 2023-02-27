package Ch14_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03_Input_Backup {

	public static void main(String[] args) {
		try
		{
			FileInputStream fi=new FileInputStream("Diary.txt");
			FileOutputStream fo=new FileOutputStream("Backup.txt");
			
			byte b[]= new byte[fi.available()];
			fi.read(b);
			fo.write(b);
			
			System.out.println("Data has been written");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
