package Ch15_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class test implements Serializable
{
	int i=10;
	int j=20;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name=sc.next();
		System.out.println(name);
	}
}

public class Serialize {

	public static void main(String[] args) throws IOException {
		test t = new test();
		FileOutputStream fos = new FileOutputStream("/home/luser/Desktop/abc.ser");
		ObjectOutput ois = new ObjectOutputStream(fos);
		ois.writeObject(t);
		System.out.println("Done");
		fos.close();

	}

}
