package Ch10_StringBuffer;

public class Demo08_ToCharArray {

	public static void main(String[] args) {
		String s1="Raj";
		char ch[]=s1.toCharArray();
		
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//Converting character int String
		
		char ch1[]= {'r','a','j'};
		String s2=new String(ch1);
		System.out.println(s2);

	}

}
