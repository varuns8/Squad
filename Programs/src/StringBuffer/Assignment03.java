package StringBuffer;

public class Assignment03 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		String s = "Yellow Umbrella";
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
			else {
				sum++;
			}
		}
		System.out.println("Vowels are: "+count);
		System.out.println("Constant are: "+sum);
		
		
		

	}

}
