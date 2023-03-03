package Ch16_WrapperClasses;

// Autoboxing :- Converting Primitive datatype into object

public class Autoboxing {

	public static void main(String[] args) {
		// Method 1:
		int a=10;
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		// Method 2:
		Integer k=a;
		System.out.println(k);
		
		double d = 2.5;
		Double m = Double.valueOf(d);
		System.out.println(m);
		
		//Autoboxing using conversion method:
		String s="123";
		int value = Integer.parseInt(s);
		System.out.println(value);
		
		/*String s2="1 23";
		int value2 = Integer.parseInt(s2);
		System.out.println(value2);*/
	}

}
