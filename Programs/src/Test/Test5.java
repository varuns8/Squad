package Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test5 {

	public static void main(String[] args) {
		char s[] = "Yellow Umbrella".toCharArray();
		
		HashSet<Character> hs = new LinkedHashSet<>(s.length-1);
		for(char x:s) {
			hs.add(x);
		}
		
		for(char v:hs) {		
			if((v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')) {
				System.out.print(v);
			}		
		}
	}

}