package Abstraction;

abstract class Bankdemo {
	
	abstract void rate();

}

class SBI extends Bankdemo{
	@Override
	public void rate() {
		System.out.println("Rate of Interest is 7%");
	}
}

class ICICI extends Bankdemo{
	@Override
	public void rate() {
		System.out.println("Rate of Interest is 10%");
	}
}

public class Bank{
	public static void main(String[] args) {
		SBI s = new SBI();
		s.rate();
		ICICI i = new ICICI();
		i.rate();
	}
}
