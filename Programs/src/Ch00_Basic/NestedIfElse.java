package Ch00_Basic;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 65;
		
		if (age>=18) {
			if (age<=60) {
				System.out.println("Eligible for vote");
			} else {
				System.out.println("Not inside Eligible");
			}
		} else {
			System.out.println("Not outside Eligible");
		}

	}

}
