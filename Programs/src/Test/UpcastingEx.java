package Test;

class A{
	void display() {
		System.out.println("Display");
	}
	void speed() {
		System.out.println("Speed is 80kmph");
	}
}

class B extends A{
	void speed() {
		System.out.println("Speed is 100kmph");
	}
	void show() {
		System.out.println("Show");
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		A o = new A();
		o.display();
		o.speed();

	}

}
