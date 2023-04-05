package Ch15_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("/home/luser/Desktop/abc.ser");
		ObjectInput ois = new ObjectInputStream(fis);
		test t1 = (test)ois.readObject();
		System.out.println(t1.i);
		System.out.println(t1.j);
		t1.getdata();
		System.out.println("File Successfully Read");

	}

}
