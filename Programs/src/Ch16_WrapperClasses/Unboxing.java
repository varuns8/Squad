package Ch16_WrapperClasses;

// Unboxing : Converting object into primitive datatype

public class Unboxing {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(3);
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		Double obj2 = new Double(2.5);
		double value2 = obj2.doubleValue();
		System.out.println(value2);
		
		Long obj3 = new Long(7788665544L);
		long value3 = obj3.longValue();
		System.out.println(value3);

	}

}
