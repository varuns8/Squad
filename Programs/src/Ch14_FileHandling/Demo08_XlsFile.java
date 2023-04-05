package Ch14_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo08_XlsFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("/home/luser/Desktop/abc.xls");
		fr.write("Roll No,Name");
		fr.write("\n\tRahul");
		fr.close();

	}

}
