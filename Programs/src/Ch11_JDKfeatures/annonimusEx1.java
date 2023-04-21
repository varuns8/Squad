package Ch11_JDKfeatures;

interface A{
	void m1();
	void m2();
}

public class annonimusEx1 {

	public static void main(String[] args) {
		A a=new A() {
			@Override
			public void m2() {
				System.out.println("This is m2");
			}
			@Override
			public void m1() {
				System.out.println("This is m1");
			}
		};
		
		a.m1();
		a.m2();

	}

}
