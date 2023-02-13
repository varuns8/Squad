package Ch07_Abstraction;

abstract class demo {
	abstract void speed();
}

class BMW extends demo{
	@Override
	void speed() {
		System.out.println("Speed 120kmph");
	}
}

public class Vehicle{
	public static void main(String[] args) {
		BMW v1 = new BMW();
		v1.speed();
	}
}
