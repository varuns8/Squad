package Ch10_StringBuffer;

public class Demo06_SplitMethod {

	public static void main(String[] args) {
		// Split() is used to split sentence into words
		
		String s = "rahul@gmail.com";
		String a[]=s.split("@");
		for(String word:a) {
			System.out.println(word);
		}

	}

}
