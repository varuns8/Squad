package ExceptionHandling;

public class ArrayHandling {

	public static void main(String[] args) {
		try {
		int num[] = {10,40,20};
		System.out.println(num[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Always Execute");
		}
		
		System.out.println("Hello");

	}

}
