package ExceptionHandling;

public class Demo3 {

	public static void main(String[] args) {
		
		try {
			int a=25,b=0,c;
			
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally execute");
		}
		
		System.out.println("Hello");

	}

}
