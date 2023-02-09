package StringBuffer;

public class Assignment04 {

	public static void main(String[] args) {
		String s = "nitin";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.print(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		System.out.println("Original: "+s);
		System.out.println("Reverse: "+rev);
		//System.out.println();
		if(s.equals(rev)) {
			System.out.println(s+" is Palindrom");
		}
		else {
			System.out.println(s+" is Not Palindrom");
		}

	}

}
