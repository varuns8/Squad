package StringBuffer;

public class Assignment05 {

	public static void main(String[] args) {
		String s = "Rahul Ravindra Shinde";
		String parts[] = s.split(" ");
		
		for(String n:parts) {
			System.out.print(n.charAt(0));
		}

	}

}
