package Ch09_Inner;

class Outer{
	int a=20;
	
	class Inner{
		void show() {
			System.out.println("a is "+a);
		}
	} //Inner class end
	
}

public class Inner1 {

	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner in = obj.new Inner();
		in.show();

	}

}
