package Inner;

class Outer2{
	
	void getValue() {
	int sum=20;
	int divisor=5;
	
	class Inner2{
		private int getDivisor() {
			return divisor;
		}
		
		private int getRemainder() {
			return sum%divisor;
		}
		private int getQuotient() {
			return sum/divisor;
		}
	
	}
	
	Inner2 in = new Inner2();
	System.out.println("Divison: "+in.getDivisor());
	System.out.println("Remainder: "+in.getRemainder());
	System.out.println("Quotient: "+in.getQuotient());
	
	} //method close
	
} //Outer close

public class Demo1 {

	public static void main(String[] args) {
		
		Outer2 obj = new Outer2();
		obj.getValue();
		

	}
	

}
