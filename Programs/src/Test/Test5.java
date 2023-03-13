package Test;

public class Test5 {

	public static void main(String[] args) {
		//int count=0;
		//char sum=' ';
		String s = "Yellow Umbrella";
		
		for(int i=0; i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				if((s.charAt(0)!=s.charAt(i) || s.charAt(1)!=s.charAt(i)))
				System.out.print(ch);
			}
			
		}
	}

}
