package Ch14_FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//WAP to write data in fileinfo.txt file using user input

public class Demo04_FileWriter {

	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("fileinfo.txt",true);//here true is used to continue write.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Here: ");
			String s1 = sc.nextLine();
			fw.write(s1);
			fw.flush(); // to cleaning previous data
			fw.close(); // to close previous resources
			System.out.println("Data has been written!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
