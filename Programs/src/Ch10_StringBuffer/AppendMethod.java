package Ch10_StringBuffer;

public class AppendMethod {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Rahul");
		String str = new StringBuffer().append("Mandar").toString();
		System.out.println(str);
		
		int num=121;
		String s1 = Integer.toString(num);
		System.out.println(s1);
		
		int rev=121;
		String s2 = Integer.toString(rev);
		
		if(s1.equals(s2))
		{
			System.out.println(s1+ " is Palindrme");
		}

	}

}
