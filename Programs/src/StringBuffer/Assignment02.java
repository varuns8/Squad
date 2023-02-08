package StringBuffer;

public class Assignment02 {

	public static void main(String[] args) {
		String s = "My Name is Roshan";
		String word[] = s.split(" ");
		
		for(int i=word.length-1; i>=0; i++) {
			for(int j=i; j>=4; j--) {
				System.out.println(word[j]+" ");
			}
			System.out.println();
		}

	}

}
