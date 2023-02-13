package Ch10_StringBuffer;

public class Assignment01 {

	public static void main(String[] args) {
		
		String s = "I Love My Country";
		String word[] = s.split(" ");
		
		for(int i=word.length-1; i>=0; i--) {
			for (int j=0; j<=i;j++) {
				System.out.print(word[j]+" ");
			}
			System.out.println();
		}
	}

}
