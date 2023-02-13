package Ch10_StringBuffer;

public class Assignment02 {

	public static void main(String[] args) {
		String s = "My Name is Roshan";
		String word[] = s.split(" ");
		
		for(int i=3; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				System.out.print(word[j]+" ");
			}
			System.out.println();
		}

	}

}
