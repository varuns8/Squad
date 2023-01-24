package Inner;

class A{
	void show() {
		System.out.println("I am in A");
	}
}

public class Anonymous {

	public static void main(String[] args) {
		A obj = new A() {
			void show() {
				System.out.println("I am in B");
			}
		};
		obj.show();

	}

}
